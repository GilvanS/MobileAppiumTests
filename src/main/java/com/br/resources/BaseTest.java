package com.br.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.Properties;

import com.br.config.Config;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

    public static Properties prop;

    @BeforeTest
    @Parameters({"platformName", "deviceName"})
    public void beforeTest(@Optional("defaultPlatform") String platformName, @Optional("defaultDevice") String deviceName) throws URISyntaxException, IOException {
        prop = new Properties();
        try (FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties")) {
            prop.load(fis);
        }

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:appPackage", "com.swaglabsmobileapp");
        capabilities.setCapability("appium:appActivity", "com.swaglabsmobileapp.MainActivity");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:deviceName", "Android Emulator");
        capabilities.setCapability("appium:ignoreHiddenApiPolicyError", true);
        capabilities.setCapability("appium:ensureWebviewsHavePages", true);
        capabilities.setCapability("appium:newCommandTimeout", 3600);
        capabilities.setCapability("appium:connectHardwareKeyboard", true);

        URI url = new URI("http://127.0.0.1:4723/wd/hub"); // Ensure this matches your Appium server
        Config.driver = new AndroidDriver(url.toURL(), capabilities);
        Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}