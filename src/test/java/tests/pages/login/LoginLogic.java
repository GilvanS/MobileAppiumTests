package tests.pages.login;

import lombok.extern.slf4j.Slf4j;
import tests.utils.Actions;

@Slf4j
public class LoginLogic {

    private static LoginPage loginPage = new LoginPage();

    public static void validatePage() {
        loginPage.validatePage();
    }

    public static void clickBtnCampo(String opcao) {
        switch (opcao.toUpperCase()) {
            case "USERNAME":
                Actions.sendKeys(loginPage.getTxtUsername(), "standard_user");
                break;
            case "PASSWORD":
                Actions.sendKeys(loginPage.getTxtPassword(), "secret_sauce");
                break;
            default:
                log.warn("Opção inválida: " + opcao);
                break;
        }
    }

    public static void clickBtnLogin() {
        Actions.click(loginPage.getBtnLogin());
    }
}