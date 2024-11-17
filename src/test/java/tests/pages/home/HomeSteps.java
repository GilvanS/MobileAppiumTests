package tests.pages.home;

import io.cucumber.java.en.Given;
import tests.pages.profile.ProfileLogic;

public class HomeSteps {

    private ProfileLogic profileLogic;

    public HomeSteps() {
        HomeLogic HomeLogic = new HomeLogic ();
    }

    @Given("que estou na tela inicial do app {string}")
    public void queEstouNaTelaInicialDoAppSwagLabs(String arg) throws Exception {
    }

}
