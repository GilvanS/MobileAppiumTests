package tests.utils;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Classe utilitária para inicialização de páginas usando o padrão Page Factory.
 */
@Slf4j
public class MasterPageFactory {

	/**
	 * Método genérico para obter uma instância da página especificada.
	 * @param cls Classe da página a ser instanciada
	 * @return Instância da página inicializada
	 */
	public static <T> T getPage(Class<T> cls) {
		T pageInstance;
		try {
			// Verifica se o driver está inicializado
			WebDriver driver = Hooks.getDriver();
			if (driver == null) {
				throw new IllegalStateException("O driver do Appium não está inicializado.");
			}

			// Instancia a página usando o construtor padrão
			pageInstance = cls.getDeclaredConstructor().newInstance();

			// Inicializa os elementos da página usando o AppiumFieldDecorator
			PageFactory.initElements(new AppiumFieldDecorator(driver), pageInstance);

		} catch (InstantiationException e) {
			log.error("Erro ao instanciar a classe da página: " + cls.getName(), e);
			throw new RuntimeException("Não foi possível instanciar a classe da página.", e);
		} catch (IllegalAccessException e) {
			log.error("Acesso ilegal ao construtor da classe da página: " + cls.getName(), e);
			throw new RuntimeException("Acesso ilegal ao instanciar a classe da página.", e);
		} catch (NoSuchMethodException e) {
			log.error("Construtor sem argumentos não encontrado na classe da página: " + cls.getName(), e);
			throw new RuntimeException("Construtor padrão não encontrado.", e);
		} catch (Exception e) {
			log.error("Erro geral na instância da página: " + cls.getName(), e);
			throw new RuntimeException("Erro ao instanciar a classe da página.", e);
		}
		return pageInstance;
	}
}