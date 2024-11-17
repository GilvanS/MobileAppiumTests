package tests.pages.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import tests.pages.profile.ProfileLogic;

@Slf4j
public class LoginSteps {

    LoginLogic loginLogic = new LoginLogic();


    @Given("preencho o campo {string} na tela login")
    public void preenchoOCampo(String campo) throws Exception {
        switch (campo.toLowerCase()) {
            case "username":
                LoginLogic.preencherCampoUsername();
                break;
            case "password":
                LoginLogic.preencherCampoPassword();
                break;
            default:
                throw new Exception ("Campo não reconhecido: " + campo);
        }
    }

    @When("clico no botao {string} na tela login")
    public void clicoNoBotaoLogIn(String arg) throws Exception {
        LoginLogic.clickBtnLogin();
    }
    @Then("valido a exibicao dos produtos na tela {string}")
    public void validoAExibicaoDosProdutosNaTela(String string) {

    }


}
