package tests.utils.gerador;

import com.github.javafaker.Faker;

public class FakerJava {

    // Declarando o parâmetro Faker como protected
    protected Faker faker;

    // Construtor da classe
    public FakerJava() {
        // Inicializando o Faker com o locale pt-BR
        this.faker = new Faker();
//        this.faker = Faker.instance(new Locale("pt", "BR"));

    }

    public String gerarNomeCompleto(Faker faker) {
        return faker.name().fullName();
    }
    public String gerarPrimeiroNome(Faker faker) {
        return faker.name().firstName();
    }
    public String gerarSobreNome(Faker faker) {
        return faker.name().lastName();
    }
    public String gerarEmail(Faker faker) {
        return faker.internet().emailAddress();
    }
    public String gerarTelefone(Faker faker) {
        return faker.phoneNumber().phoneNumber();
    }
    public String gerarAddress(Faker faker) {
        return faker.address().fullAddress();
    }
    public String gerarAddress1() {
        return faker.address().streetAddress();
    }
    public String gerarAddress2() {
        return faker.address().secondaryAddress();
    }
    public String gerarCidade() {
        return faker.address().city();
    }
    public String gerarEstadoRegiao() {
        return faker.address().state();
    }
    public String gerarCodigoPostal() {
        return faker.address().zipCode();
    }
    public String gerarPais() {
        return faker.address().country();
    }
    public String gerarCartaoCredito() {
        return faker.business().creditCardNumber();
    }
    public String gerarDataVencimento() {
        return faker.business().creditCardExpiry();
    }
    public String gerarCvv() {
        return faker.number().digits(3);
    }
    public Integer gerarvalorAleatorio() {
        return faker.number().numberBetween(2001, 100000);
    }
    static FakerJava fakerJava = new FakerJava();
    public static String nomeCompleto = fakerJava.gerarNomeCompleto(fakerJava.faker);
    public static String primeiroNome = fakerJava.gerarPrimeiroNome(fakerJava.faker);
    public static String sobreNome = fakerJava.gerarSobreNome(fakerJava.faker);
    public static String email = fakerJava.gerarEmail(fakerJava.faker);
    public static String telefone = fakerJava.gerarTelefone(fakerJava.faker);
    public static String address = fakerJava.gerarAddress(fakerJava.faker);
    public static String address1 = fakerJava.gerarAddress1();
    public static String address2 = fakerJava.gerarAddress2();
    public static String cidade = fakerJava.gerarCidade();
    public static String estadoRegiao = fakerJava.gerarEstadoRegiao();
    public static String codigoPostal = fakerJava.gerarCodigoPostal();
    public static String pais = fakerJava.gerarPais();
    public static String cartaoCredito = fakerJava.gerarCartaoCredito();
    public static String dataVencimento = fakerJava.gerarDataVencimento();
    public static String cvv = fakerJava.gerarCvv();
    public static Integer valorAleatorio = fakerJava.gerarvalorAleatorio();
}

