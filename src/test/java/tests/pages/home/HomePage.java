package tests.pages.home;

import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import tests.utils.PageMaker;

@Getter
public class HomePage implements PageMaker {

    HomePage homePage = PageMaker.getPage(HomePage.class);

    @AndroidFindBy(xpath = "//*[@resource-id= 'tab-profile']")
    private WebElement clicarBtnProfile;
}
