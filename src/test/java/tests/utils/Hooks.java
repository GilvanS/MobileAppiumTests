package tests.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;


@Slf4j
public class Hooks {

    private static AppiumDriverLocalService server;
    static AppiumDriver driver;

    @BeforeAll
    public static void setUpServer(){
        server = new AppiumServiceBuilder()
                .usingPort(AppiumDriverHelper.PORTA) // Use a mesma porta
                .withArgument(() -> "--base-path", "/wd/hub")
                .withArgument(GeneralServerFlag.LOG_LEVEL, "error")
                .build();
        server.start();
        log.info("Inicializando o servidor do Appium");
    }

    @AfterAll
    public static void tearDownServer(){

        log.info("Finalizando o servidor do Appium");

        if(server != null) server.stop();
        server = null;

    }

    @Before
    public void setUpDriver(){

        log.info("Inicializando o driver");

        driver = AppiumDriverHelper.getDriver();

    }

    @After
    public void tearDownDriver(){

        if(driver != null) driver.quit();
        driver = null;

    }

    public static AppiumDriver<?> getDriver() {
        return driver;
    }

    public static int gerarPortaAleatoria() {
        try (ServerSocket socket = new ServerSocket()) {
            socket.setReuseAddress(true);
            socket.bind(new InetSocketAddress (0));
            return socket.getLocalPort();
        } catch (IOException e) {
            throw new RuntimeException("Não foi possível encontrar uma porta livre.", e);
        }
    }


}
