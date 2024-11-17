package tests.pages.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

/**
 * Define os passos de teste para o Cucumber no contexto de login.
 */
@Slf4j
public class LoginSteps {

    private final LoginLogic loginLogic = new LoginLogic();

    @Given("que estou na tela inicial do app {string}")
    public void queEstouNaTelaInicialDoApp(String app) {
        loginLogic.validatePage();
    }

    @And("preencho o campo {string} na tela {string}")
    public void preenchoOCampo(String campo, String tela) {
        loginLogic.preencherCampo(campo);
    }

    @And("clico no botao {string} na tela {string}")
    public void clicoNoBotao(String arg, String tela) {
        loginLogic.clicarBotaoLogin();
    }
}