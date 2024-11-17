package tests.pages.login;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import tests.pages.home.HomePage;
import tests.utils.MasterPageFactory;

@Getter
public class LoginPage extends MasterPageFactory {

    LoginPage loginPage = MasterPageFactory.getInstance(LoginPage.class);

    @AndroidFindBy(xpath = "//*[@content-desc='test-LOGIN']")
    private WebElement clicarBtnLogin;

    @AndroidFindBy(xpath = "//*[@content-desc='test-Username']")
    private WebElement inserirUsername;

    @AndroidFindBy(xpath = "//*[@content-desc= 'test-Password']")
    private WebElement inserirPassword;

    @AndroidFindBy(xpath = "//*[@text= 'standard_user']")
    private WebElement clicarBtnStandarUser;

    @AndroidFindBy(xpath = "//*[@text= 'locked_out_user']")
    private WebElement clicarBtnLockedOutUser;

    @AndroidFindBy(xpath = "//*[@text= 'problem_user']")
    private WebElement clicarBtnProblemUser;

    @AndroidFindBy(xpath = "//*[@text= 'secret_sauce']")
    private WebElement clicarBtnSecretSauce;


}
