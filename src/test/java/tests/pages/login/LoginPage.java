package tests.pages.login;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import tests.utils.Actions;
import tests.utils.Hooks;

@Getter
public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Hooks.getDriver()), this);
    }

    public void validatePage() {
        Actions.waitElementPresence("//*[@content-desc='test-Login']/android.view.ViewGroup/android.widget.ImageView[1]");
    }

    @AndroidFindBy(xpath = "//*[@content-desc='test-Username']")
    private WebElement txtUsername;

    @AndroidFindBy(xpath = "//*[@content-desc='test-Password']")
    private WebElement txtPassword;

    @AndroidFindBy(xpath = "//*[@content-desc='test-LOGIN']")
    private WebElement btnLogin; // Ajuda a corrigir XPath incorreto
}