package tests.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static tests.utils.AppiumDriverHelper.getDriver;


public class Actions {


    public static void sendKeysElement(String text) {
        org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(getDriver());
        actions.sendKeys(text).perform();
    }

    public static void waitElement(String element) {
        element = String.valueOf(new WebDriverWait(getDriver(), (3000))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element))));
    }

    public static void clickElement(String element) {
        getDriver().findElement(By.xpath(element)).click();
    }
    public static void getTextElement(String element) {
        getDriver().findElement(By.xpath(element)).getText();
    }
}
