package tests.utils;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.*;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.HasOnScreenKeyboard;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.clipboard.HasClipboard;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.Widget;


public class MobileActions {

    private Function<WebElement, ExpectedCondition<WebElement>> clickableCondition = ExpectedConditions::elementToBeClickable;
    private Predicate<AppiumDriver> isDriverInstanceEqualsToNull = Objects::isNull;
    private AppiumDriverHelper MobileDriverThreadLocal;
    private Predicate<AppiumDriver> isDriverInstanceDifferentOfCurrentDriverInstance = driverInstance -> !driverInstance
            .equals(MobileDriverThreadLocal.getDriver());
    private static final Logger LOGGER = LogManager.getLogger(MobileActions.class);

    private AppiumDriver driver;
    private Wait<?> wait;



}
