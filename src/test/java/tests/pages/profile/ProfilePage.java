package tests.pages.profile;

import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import tests.utils.PageMaker;

@Getter
public class ProfilePage implements PageMaker {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text= 'Sign up']")
    private WebElement clicarBtnSignUp;

}
