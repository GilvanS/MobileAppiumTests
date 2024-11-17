package tests.pages.login;

import io.appium.java_client.AppiumDriver;
import lombok.extern.slf4j.Slf4j;
import tests.pages.home.HomePage;
import tests.utils.Actions;
import tests.utils.AppiumDriverHelper;
import tests.utils.MasterPageFactory;


@Slf4j
public class LoginLogic {

    private static LoginPage loginPage;
    private static AppiumDriver driver;
    private static Actions actions;

    public static HomePage homePage() {
        loginPage = MasterPageFactory.getInstance(LoginPage.class);
        return null;
    }

    public static void preencherCampoUsername() throws Exception {
        if (actions != null && loginPage.getInserirUsername() != null) {
            actions.sendKeys("standard_user");
        } else {
            throw new IllegalStateException("O objeto Actions ou elemento Username não está inicializado!");
        }
    }

    public static void preencherCampoPassword() throws Exception {
            actions.sendKeys("secret_sauce");
    }

    public static void clickBtnLogin() {
            loginPage.getClicarBtnLogin().click();
    }
    public static void clickBtnStandardUser() throws Exception {

        log.info ("clickBtnStandardUser");
    }
    public static void clickBtnSecretsauce() throws Exception {

        log.info ("clickBtnSecretsauce");

    }

    public static void clicarBtnProducts() throws Exception {

    }
}
