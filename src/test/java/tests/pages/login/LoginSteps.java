package tests.pages.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginSteps {

    LoginLogic loginLogic = new LoginLogic();


    @Given("preencho o campo {string} na tela login")
    public void preenchoOCampo(String campo) throws Exception {
        switch (campo.toLowerCase()) {
            case "username":
                LoginLogic.clickBtnUsername();
                break;
            case "password":
                LoginLogic.clickBtnPassword();
                break;
            default:
                throw new Exception("Campo não reconhecido: " + campo);
        }
    }
//    @When("preencho o campo {string}")
//    public void preenchoOCampoUsername(String opcao) throws Exception {
//        LoginLogic.clickBtncampo(opcao);
//    }
    @When("clico no botao {string} na tela login")
    public void clicoNoBotaoLogIn(String arg) throws Exception {
        LoginLogic.clickBtnLogin();
    }


}
