package tests.utils;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

/**
 * Classe utilitária para manuseio de ações comuns em testes móveis usando Appium.
 */
public class Actions {

    /**
     * Clica no elemento fornecido após esperar pela sua visibilidade.
     * @param element o WebElement a ser clicado
     */
    public static void click(WebElement element) {
        waitElement(element);
        element.click();
    }

    /**
     * Envia uma string de entrada para o elemento fornecido com um delay configurado.
     * @param element o WebElement que receberá a string
     * @param value a string a ser enviada
     */
    public static void sendKeys(WebElement element, String value) {
        element.sendKeys(value);
        delay(Constants.SEND_KEYS_DELAY_IN_MILLISECONDS);
    }

    /**
     * Esconde o teclado se estiver visível.
     */
//    public static void hideKeyboard() {
//        Hooks.getDriver().hideKeyboard();
//    }

    /**
     * Realiza um swipe vertical da metade para o topo da tela.
     */
    public static void swipeVertical() {
        Dimension size = Hooks.getDriver().manage().window().getSize();
        int starty = (int) (size.height * 0.5);
        int endy = (int) (size.height * 0.2);
        int startx = (int) (size.width / 2);

        new TouchAction<>((PerformsTouchActions) Hooks.getDriver())
                .press(PointOption.point(startx, starty))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(startx, endy))
                .release().perform();
    }

    /**
     * Realiza um swipe horizontal do centro para a esquerda da tela.
     */
    public static void swipeHorizontal() {
        Dimension size = Hooks.getDriver().manage().window().getSize();
        int starty = (int) (size.height / 2);
        int startx = (int) (size.width * 0.5);
        int endx = (int) (size.width * 0.2);

        new TouchAction<>((PerformsTouchActions) Hooks.getDriver())
                .press(PointOption.point(startx, starty))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(endx, starty))
                .release().perform();
    }

    /**
     * Introduz um delay pelo número de milissegundos especificado.
     * @param milliseconds o tempo de delay em milissegundos
     */
    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }

    /**
     * Espera pela visibilidade de um elemento e o retorna.
     * @param element o WebElement a ser aguardado
     * @return o WebElement visível
     */
    public static WebElement waitElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Hooks.getDriver(), Duration.ofSeconds(60));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Método placeholder para esperar pela presença de um elemento usando um localizador.
     * @param locator o localizador do elemento
     */
    public static void waitElementPresence(String locator) {
        // Implementar lógica para esperar pela presença de um elemento com base no localizador
    }
}