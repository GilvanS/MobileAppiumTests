package tests.utils;

public class PageException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PageException(String message) {
		super(message);
	}

	public PageException(Throwable cause) {
		super(cause);
	}

	public PageException(String message, Throwable e) {
		super(message, e);
	}
}
