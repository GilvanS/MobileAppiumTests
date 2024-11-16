package tests.pages.login;

import io.appium.java_client.AppiumDriver;
import lombok.extern.slf4j.Slf4j;



@Slf4j
public class LoginLogic {



    public static void validarTxtAppLogoAndName() throws Exception {

    }
    public static void clickBtnHamburger() throws Exception {

    }

    public static void clickBtncampo(String opcao) throws Exception {

        // Normaliza a string de entrada para maiúsculas e remove espaços para comparação
        String opcaoNormalizada = opcao.toUpperCase().replace(" ", "_");

        // Determina a ação com base na opção
        switch(opcaoNormalizada) {
            case "Username":

                break;
            case "Password":

                break;
            default:
                System.out.println("Opção inválida: " + opcao);
                break;
        }

    }

    public static void clickBtnUsername() throws Exception {

    }

    public static void clickBtnPassword() throws Exception {

    }

    public static void clickBtnLogin() throws Exception {

        log.info ("clickBtnLogin");

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
