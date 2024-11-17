package tests.pages.login;

import lombok.extern.slf4j.Slf4j;
import tests.utils.Actions;

/**
 * Classe responsável pela lógica de operações na página de login.
 */
@Slf4j
public class LoginLogic {

    private LoginPage loginPage = new LoginPage();

    /**
     * Valida se a página de login foi carregada corretamente.
     */
    public void validatePage() {
        loginPage.validatePage();
    }

    /**
     * Preenche o campo especificado com valores padrão.
     * @param opcao O campo a ser preenchido (USERNAME ou PASSWORD).
     */
    public void preencherCampo(String opcao) {
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

    /**
     * Clica no botão de login.
     */
    public void clicarBotaoLogin() {
        Actions.click(loginPage.getBtnLogin());
    }
}