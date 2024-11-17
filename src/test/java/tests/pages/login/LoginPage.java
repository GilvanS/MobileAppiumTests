package tests.pages.login;

import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebElement;
import tests.utils.Actions;

@Getter
@NoArgsConstructor
public class LoginPage extends Actions {

    public void validatePage(){
        validateElementPresence("//*[@content-desc='test-Login']/android.view.ViewGroup/android.widget.ImageView[1]");
    }

    @AndroidFindBy(xpath = "//*[@content-desc= 'test-Username']")
    private WebElement txtUsername;

    @AndroidFindBy(xpath = "//*[@content-desc='test-Password']")
    private WebElement txtPassword;

    @AndroidFindBy(xpath = "//*p[@content-desc='test-LOGIN']")
    private WebElement btnLogin;
}
