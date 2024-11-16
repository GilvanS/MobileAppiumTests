package tests.utils;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.support.PageFactory;


@Slf4j
public class MasterPageFactory {

	/**
	 * Return the instance of mobile factory page objects
	 *
	 * @param <T>
	 * @param pageClass
	 * @return instance of page objects
	 */
	public static <T extends MasterPageFactory> T getInstance(Class<T> pageClass) {
		try {
			T pageObject = pageClass.getDeclaredConstructor().newInstance();
			PageFactory.initElements(new AppiumFieldDecorator(Hooks.getDriver()), pageObject);

			return pageObject;
		} catch (Exception e) {
			throw new PageException("Error in page mobile", e);
		}
	}

	public static org.slf4j.Logger getLog() {
		return log;
	}
}

