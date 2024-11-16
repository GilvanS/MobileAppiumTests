package tests.pages.profile;

import io.appium.java_client.AppiumDriver;
import lombok.extern.slf4j.Slf4j;
import tests.pages.home.HomePage;
import tests.utils.Actions;
import tests.utils.MasterPageFactory;
import tests.utils.gerador.RandomGenerator;

import static tests.utils.gerador.FakerJava.*;

@Slf4j
public class ProfileLogic {

    private static ProfilePage profilePage;
    private static tests.utils.Actions Actions;

    public static HomePage homePage() {
        profilePage = MasterPageFactory.getInstance(ProfilePage.class);
        return null;
    }

    public static void clicarBtnSignUp() throws Exception {
        log.info ("Clico no botão 'Sign Up'");
        Actions.click(profilePage.getClicarBtnSignUp());
        Actions.sleep(2000);
    }

    public static void btnFirstName() throws Exception {
        log.info("Primeiro Nome: {}", primeiroNome);
        Actions.sendKeys(primeiroNome);
        Actions.sleep(2000);

    }
    public static void btnLastName() throws Exception {
        log.info("Segundo Nome: {}", sobreNome);
        Actions.sendKeys(sobreNome);
        Actions.sleep(2000);

    }
    public static void btnPhone() throws Exception {
        log.info("Telefone: {}", RandomGenerator.mobileNumber());
        Actions.sendKeys(RandomGenerator.mobileNumber());
        Actions.sleep(2000);
    }
    public static void btnEmail() throws Exception {
        log.info("Email: {}", email);
        Actions.sendKeys(email);
        Actions.sleep(2000);

    }
    public static void btnPassword() throws Exception {
        log.info("Senha: {}", "Passord1");
        Actions.sendKeys("Passord1");
        Actions.sleep(2000);

    }
    public static void btnConfirmPassword() throws Exception {
        log.info("Confirmar Senha: {}", "Passord1");
        Actions.sendKeys("Passord1");
        Actions.sleep(2000);

    }
    public static void btnCreate() throws Exception {

    }

    public static void btnLogin() throws Exception {

    }
    public static void btnCart() throws Exception {

    }
    public static void btnContinueShopping() throws Exception {

    }
    public static void btnContinueToPayment() throws Exception {

    }
    public static void clicarBtnYes() throws Exception {

    }


}
