package com.br.tests;

import com.br.config.Config;
import com.br.resources.BaseTest;
import io.appium.java_client.AppiumBy;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Slf4j
public class SwaglabsLoginTest extends BaseTest {

    @Test
    public void swaglabs_login_invalid_username() {
        SoftAssert softAssert = new SoftAssert();

        WebElement usernameField = Config.driver.findElement(AppiumBy.accessibilityId("test-Username"));
        usernameField.click();
        usernameField.sendKeys("standard_user");

        Config.driver.findElement(AppiumBy.accessibilityId("test-LOGIN")).click();

        String expectedErrorMsg = "Password is required";
        String actualErrorMsg = Config.driver.findElement(
                AppiumBy.androidUIAutomator(
                        "new UiSelector().text('Password is required')")).getText();

        log.info("ActualErrorMsg: {}; ExpectedErrorMsg: {}", actualErrorMsg, expectedErrorMsg);
        softAssert.assertEquals(actualErrorMsg, expectedErrorMsg, "Error message does not match!");

        softAssert.assertAll();
    }

    @AfterTest
    public void afterTest() {
        Config.closeDriver();
    }
}