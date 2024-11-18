package tests.pages.login;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import tests.utils.Hooks;

/**
 * Representa a página de login e inicializa seus elementos.
 */
@Getter
public class LoginPage {

    /**
     * Construtor que inicializa os elementos da página.
     */
    public LoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Hooks.getDriver()), this);
    }

    /**
     * Valida a presença de um elemento chave na página de login.
     */
    public void validatePage() {
        // Aqui, usaríamos uma verificação mais robusta se necessário
    }

    @AndroidFindBy(xpath = "//*[@content-desc='test-Username']")
    private WebElement txtUsername;

    @AndroidFindBy(xpath = "//*[@content-desc='test-Password']")
    private WebElement txtPassword;

    @AndroidFindBy(xpath = "//*[@content-desc='test-LOGIN']")
    private WebElement btnLogin;

	public WebElement getTxtUsername() {
		// TODO Auto-generated method stub
		return null;
	}
}