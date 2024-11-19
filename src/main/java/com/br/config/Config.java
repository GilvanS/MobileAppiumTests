package com.br.config;

import io.appium.java_client.AppiumDriver;

public class Config {

    public static AppiumDriver driver = null;

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}