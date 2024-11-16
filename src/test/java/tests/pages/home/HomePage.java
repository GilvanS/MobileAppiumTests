package tests.pages.home;

import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import tests.utils.MasterPageFactory;


@Getter
public class HomePage extends MasterPageFactory {

    HomePage homePage = MasterPageFactory.getInstance(HomePage.class);

    @AndroidFindBy(xpath = "//*[@resource-id= 'tab-profile']")
    private WebElement clicarBtnProfile;
}
