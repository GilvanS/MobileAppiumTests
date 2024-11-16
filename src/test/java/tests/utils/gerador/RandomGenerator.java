package tests.utils.gerador;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class RandomGenerator {

    // Variável estática para armazenar o número de telefone gerado
    private static String numeroTelefone;

    protected RandomGenerator() {
    }

    /**
     * Gerar um número pseudo-aleátorio entre o limite inferior (inclusivo) e o limite superior
     * (exclusivo)
     *
     * @param limiteInferior O menor número que pode ser gerado.
     * @param limiteSuperior O número imediatamente superior ao maior número que pode ser gerado.
     * @return Um inteiro aleatório entre os limites.
     */
    public static int getInt(int limiteInferior, int limiteSuperior) {
        return limiteInferior + new Random().nextInt(limiteSuperior - limiteInferior);
    }

    /**
     * Gera um número aleatório de celular no formato 11000000000.
     * Se já gerado, retorna o mesmo número.
     *
     * @return Uma String representando um número de celular formatado.
     */
    public static String mobileNumber() {
        if (numeroTelefone == null) {
            int ddd = getInt(11, 100); // Gera um DDD entre 11 e 99
            int prefixo = getInt(90000, 100000); // Gera a parte inicial do número
            int sufixo = getInt(1000, 10000); // Gera a parte final do número
            numeroTelefone = String.format("%02d%d%d", ddd, prefixo, sufixo);
        }
        return numeroTelefone;
    }

    /**
     * Gera um número aleatório de 0 a 9.
     *
     * @return Um inteiro entre 0 e 9.
     */
    public static int fromZeroToNine() {
        return getInt(0, 10);
    }

    public static String getLowerCaseString(int length) {
        return RandomStringUtils.randomAlphabetic(length).toLowerCase();
    }

    public static String getUpperCaseString(int length) {
        return RandomStringUtils.randomAlphabetic(length).toUpperCase();
    }

    /**
     * Gera um CEP aleatório de 06000-000 até 09999-000.
     *
     * @return Uma String representando um CEP aleatório.
     */
    public static String cep() {
        return "0" + getInt(1000, 6000) + "000";
    }
}