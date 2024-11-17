package tests.utils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Actions {

    public static void click(WebElement element) {
        waitElement(element).click();
    }

    public static void sendKeys(WebElement element, String value) {
        element.sendKeys(value);
        delay(Constants.SEND_KEYS_DELAY_IN_MILLISECONDS);
    }

    public static void hideKeyboard() {
        Hooks.getDriver().hideKeyboard();
    }

    public static void swipeVertical() {
        Dimension size = Hooks.getDriver().manage().window().getSize();
        int starty = (int) (size.height * 0.5);
        int endy = (int) (size.height * 0.2);
        int startx = (int) (size.width / 2);

        new TouchAction<>(Hooks.getDriver())
                .press(PointOption.point(startx, starty))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(startx, endy))
                .release().perform();
    }

    public static void swipeHorizontal() {
        Dimension size = Hooks.getDriver().manage().window().getSize();
        int starty = (int) (size.height / 2);
        int startx = (int) (size.width * 0.5);
        int endx = (int) (size.width * 0.2);

        new TouchAction<>(Hooks.getDriver())
                .press(PointOption.point(startx, starty))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(endx, starty))
                .release().perform();
    }

    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }

    public static WebElement waitElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Hooks.getDriver(), Constants.TIMEOUT_PRESENCE_OF_ELEMENT_LOCATED_SECONDS);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitElementPresence(String s) {
    }
}