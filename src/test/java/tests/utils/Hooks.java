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

/**
 * Classe utilitária de hooks para configuração de testes com Appium e Cucumber.
 */
@Slf4j
public class Hooks {

    private static AppiumDriverLocalService server;
    static AppiumDriver driver;

    /**
     * Configura e inicia o servidor Appium antes de todos os testes.
     */
    @BeforeAll
    public static void setUpServer(){
        server = new AppiumServiceBuilder()
                .usingPort(AppiumDriverHelper.PORTA) // Usa a mesma porta definida
                .withArgument(() -> "--base-path", "/wd/hub")
                .withArgument(GeneralServerFlag.LOG_LEVEL, "error")
                .build();
        server.start();
        log.info("Inicializando o servidor do Appium");
    }

    /**
     * Finaliza o servidor Appium após todos os testes.
     */
    @AfterAll
    public static void tearDownServer(){
        log.info("Finalizando o servidor do Appium");
        if(server != null) server.stop();
        server = null;
    }

    /**
     * Inicializa o AppiumDriver antes de cada teste.
     */
    @Before
    public void setUpDriver(){
        log.info("Inicializando o driver");
        driver = AppiumDriverHelper.getDriver();
    }

    /**
     * Encerra o AppiumDriver após cada teste.
     */
    @After
    public void tearDownDriver(){
        if(driver != null) driver.quit();
        driver = null;
    }

    /**
     * Retorna o AppiumDriver atual.
     * @return AppiumDriver
     */
    public static AppiumDriver getDriver() {
        return driver;
    }

    /**
     * Gera uma porta aleatória disponível para uso.
     * @return int número da porta disponível
     * @throws RuntimeException se não for possível encontrar uma porta livre
     */
    public static int gerarPortaAleatoria() {
        try (ServerSocket socket = new ServerSocket()) {
            socket.setReuseAddress(true);
            socket.bind(new InetSocketAddress(0));
            return socket.getLocalPort();
        } catch (IOException e) {
            throw new RuntimeException("Não foi possível encontrar uma porta livre.", e);
        }
    }
}