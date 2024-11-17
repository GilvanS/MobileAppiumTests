package tests.utils;

/**
 * Exceção customizada para lidar com erros específicos de páginas em testes automatizados.
 * Estende RuntimeException, permitindo seu uso para exceções não verificadas.
 */
public class PageException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * Construtor que aceita uma mensagem de erro.
	 * @param message A mensagem de erro descritiva.
	 */
	public PageException(String message) {
		super(message);
	}

	/**
	 * Construtor que aceita uma causa.
	 * @param cause A exceção subjacente que causou esta exceção.
	 */
	public PageException(Throwable cause) {
		super(cause);
	}

	/**
	 * Construtor que aceita uma mensagem de erro e uma causa.
	 * @param message A mensagem de erro descritiva.
	 * @param e A exceção subjacente que causou esta exceção.
	 */
	public PageException(String message, Throwable e) {
		super(message, e);
	}
}