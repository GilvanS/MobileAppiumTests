package tests.pages.profile;

import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import tests.utils.MasterPageFactory;

@Getter
public class ProfilePage extends MasterPageFactory {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text= 'Sign up']")
    private WebElement clicarBtnSignUp;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text= 'Sign in']")
    private WebElement campoFirstName;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text= 'Sign in']")
    private WebElement campoLastName;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text= 'Sign in']")
    private WebElement campoEmail;



}
