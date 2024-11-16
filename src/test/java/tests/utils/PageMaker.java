package tests.utils;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface PageMaker {

	Logger log = LoggerFactory.getLogger(PageMaker.class);

	public static <T> T getPage(Class<T> cls) {
		T page;
		try {
			page = cls.getDeclaredConstructor().newInstance();
			PageFactory.initElements(new AppiumFieldDecorator(Hooks.getDriver()), page);
		} catch (Exception e) {
			log.error("Error on page instantiation", e);
			throw new RuntimeException("Error creating page instance for " + cls.getName(), e);
		}
		return page;
	}
}