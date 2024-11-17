package tests.pages.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginSteps {

    LoginLogic loginLogic = new LoginLogic();

    @Given ("que estou na tela inicial do app {string}")
    public void queEstouNaTelaInicialDoApp(String app) {
        LoginLogic.validatePage();
    }

    @And("preencho o campo {string} na tela {string}")
    public void preenchoOCampo(String campo, String tela) throws Exception {
//        LoginLogic.clickBtncampo(campo, tela);
    }

    @And("clico no botao {string} na tela {string}")
    public void clicoNoBotaoLogIn(String arg, String tela) throws Exception {
        LoginLogic.clickBtnLogin();
    }


}
