package tests.utils;

import io.appium.java_client.AppiumDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

@Slf4j
public class AppiumDriverHelper {

    public static final int PORTA = Hooks.gerarPortaAleatoria(); // Gera uma única vez

    public static DesiredCapabilities getCapabilities(){
        log.info("iniciando servidor http://127.0.0.1:" + PORTA);
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("appium:appPackage", "com.swaglabsmobileapp");
        capabilities.setCapability("appium:appActivity", "com.swaglabsmobileapp.SplashActivity");
        capabilities.setCapability("deviceName", "0078720227");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("appium:noReset", false);
        capabilities.setCapability("appium:autoGrantPermissions", true);
//        cap.setCapability("appium:unicodeKeyboard", true);
//        cap.setCapability("appium:resetKeyboard", true);
        capabilities.setCapability("appium:ensureWebviewsHavePages", true);
        capabilities.setCapability("appium:newCommandTimeout", 60);
        capabilities.setCapability("appium:connectHardwareKeyboard", true);
        capabilities.setCapability("appium:eventTimings", true);
        capabilities.setCapability("appium:ignoreHiddenApiPolicyError", true);
        capabilities.setCapability("appium:ensureWebviewsHavePages", true);

        return capabilities;
    }

    public static URL getURL() throws MalformedURLException {
        return new URL("http://127.0.0.1:" + PORTA + "/wd/hub");
    }

    public static AppiumDriver getDriver() {
        AppiumDriver driver = null;

        try {
            driver = new AppiumDriver(getURL(), getCapabilities());
        } catch (Exception e) {
            log.error("Error on driver instantiation", e);
            throw new RuntimeException(e);
        }

        return driver;
    }
}
