package tests.utils;

import io.appium.java_client.AppiumDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Classe utilitária para configurar e instanciar o AppiumDriver.
 */
@Slf4j
public class AppiumDriverHelper {

    // Geração de porta aleatória
    public static final int PORTA = Hooks.gerarPortaAleatoria();

    /**
     * Configura as DesiredCapabilities para o AppiumDriver.
     * @return DesiredCapabilities configuradas
     */
    public static DesiredCapabilities getCapabilities(){
        log.info("Iniciando servidor em http://127.0.0.1:" + PORTA);
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("appium:appPackage", "com.swaglabsmobileapp");
        capabilities.setCapability("appium:appActivity", "com.swaglabsmobileapp.SplashActivity");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("deviceName", "0078720227");
        capabilities.setCapability("appium:ignoreHiddenApiPolicyError", true);
        capabilities.setCapability("ensureWebviewsHavePages", true);
        capabilities.setCapability("newCommandTimeout", 3600);
        capabilities.setCapability("connectHardwareKeyboard", true);

        return capabilities;
    }

    /**
     * Cria e retorna a URL do servidor Appium.
     * @return URL do servidor Appium
     * @throws MalformedURLException se a URL estiver malformada
     */
    public static URL getURL() throws MalformedURLException {
        return new URL("http://127.0.0.1:" + PORTA + "/wd/hub");
    }

    /**
     * Instancia e retorna o AppiumDriver configurado.
     * @return AppiumDriver instanciado
     */
    public static AppiumDriver getDriver() {
        AppiumDriver driver = null;

        try {
            driver = new AppiumDriver(getURL(), getCapabilities());
        } catch (Exception e) {
            log.error("Erro na instância do driver", e);
            throw new RuntimeException(e);
        }

        return driver;
    }
}