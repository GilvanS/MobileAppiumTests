package tests.pages.login;

import lombok.extern.slf4j.Slf4j;
import tests.utils.MasterPageFactory;

@Slf4j
public class LoginLogic {

    static LoginPage loginPage = new LoginPage();
    public static LoginPage loginPage() {
        return MasterPageFactory.getPage(LoginPage.class);
    }

    public static void validatePage(){
        loginPage().validatePage();
    }

    public static void clickBtncampo(String opcao, String tela) throws Exception {
        // Normaliza a string de entrada para maiúsculas e remove espaços para comparação
        String opcaoNormalizada = opcao.toUpperCase().replace(" ", "_");
        // Determina a ação com base na opção
        switch(opcaoNormalizada) {
            case "USERNAME":
                loginPage().getTxtUsername().sendKeys("standrd_user");
                break;
            case "PASSWORD":
                loginPage().getTxtPassword().sendKeys("secret_sauce");
                break;
            default:
                System.out.println("Opção inválida: " + opcao);
                break;
        }

    }

    public static void clickBtnLogin() throws Exception {
        loginPage ().getBtnLogin().click();
    }

}
