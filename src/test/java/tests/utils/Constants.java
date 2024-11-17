package tests.utils;

/**
 * Classe Constants para armazenar valores constantes usados em testes automatizados.
 */
public class Constants {

    /**
     * Tempo limite para a presença de um elemento localizado em segundos.
     * Usado para configurar WebDriverWait ou outras esperas dinâmicas.
     */
    public static final int TIMEOUT_PRESENCE_OF_ELEMENT_LOCATED_SECONDS = 60;

    /**
     * Delay padrão em milissegundos para pausas gerais em testes.
     * Usado para desacelerar a execução de testes, simulando interações reais.
     */
    public static final int DEFAULT_DELAY_IN_MILLISECONDS = 1000;

    /**
     * Delay em milissegundos após o envio de cada string de entrada.
     * Usado para garantir que as entradas sejam processadas corretamente.
     */
    public static final int SEND_KEYS_DELAY_IN_MILLISECONDS = 1000;
}