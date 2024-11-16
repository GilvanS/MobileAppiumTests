package tests.pages.profile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class ProfileSteps {

    private ProfileLogic profileLogic;

    public ProfileSteps() {
        ProfileLogic profileLogic = new ProfileLogic ();
    }


    @Given("clico no botao Login na tela {string}")
    public void clicoNoBotaoLoginNaTela(String string) throws Exception {
        ProfileLogic.btnLogin ();
    }

    @And("clico no botao {string} na tela {string}")
    public void clicoNoBotaoNaTela(String botao, String tela) throws Exception {
        switch (botao.toLowerCase ()) {
            case "sign up":
                ProfileLogic.clicarBtnSignUp ();
                break;
            case "create":
                ProfileLogic.clicarBtnSignUp ();
                break;
            case "carrinho":
                ProfileLogic.btnCart ();
                break;
            case "continue shopping":
                ProfileLogic.btnContinueShopping ();
                break;
            default:
                throw new Exception ("Campo não reconhecido: " + botao);
        }
    }
        @And("preencho o campo {string} na tela {string}")
        public void preenchoOCampoNaTela (String campo, String tela) throws Exception {
            switch (campo.toLowerCase ()) {
                case "first name":
                    ProfileLogic.btnFirstName ();
                    break;
                case "last name":
                    ProfileLogic.btnLastName ();
                    break;
                case "phone number":
                    ProfileLogic.btnPhone ();
                    break;
                case "email address":
                    ProfileLogic.btnEmail ();
                    break;
                case "password":
                    ProfileLogic.btnPassword ();
                    break;
//            case "confirmar password":
//                ProfileLogic.btnConfirmPassword();
//                break;
//           case "name":
//               AddANewAddressLogic.btnName();
//               break;
//           case "mobile number":
//               AddANewAddressLogic.btnMobileNumber();
//               break;
//           case "address":
//               AddANewAddressLogic.btnAddress();
//               break;
//           case "city":
//               AddANewAddressLogic.btnCity();
//               break;
//           case "state":
//               AddANewAddressLogic.btnState();
//               break;
//           case "zipcode":
//               AddANewAddressLogic.btnZipCode();
//               break;
//            default:
//                throw new Exception("Campo não reconhecido: " + campo);
            }
        }
//    @Given("clico no botao Logout na tela profile")
//    public void clicoNoBotaoLogoutNaTelaProfile() throws Exception {
//        ProductsLogic.clicarBtnLogout();
//    }
//    @Given("seleciono o produto Eos V Neck Hoodie")
//    public void selecionoOProdutoEosVNeckHoodie() throws Exception {
//        ProductsLogic.clicarBtnProdutoUm();
//    }
//    @Given("clico no botao  add to cart")
//    public void clicoNoBotaoAddToCart() throws Exception {
//        ProductsLogic.clicarBtnAddToCart();
//    }
//    @Given("clico no botao Add new Address")
//    public void clicoNoBotaoAddNewAddress() throws Exception {
//        ProductsLogic.clicarBtnAddNewAddress();
//    }
//
//    @Given("Clico no botao yes e fechar o app")
//    public void clicoNoBotaoYesEEcharOApp() throws Exception {
//        ProfileLogic.clicarBtnYes();
//    }

    @Given("Clico no botao {string} e fechar o app")
    public void clico_no_botao_e_fechar_o_app(String string) {

    }
 }

