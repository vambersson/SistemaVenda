package erro.cliente;

public class ClienteException extends Exception {

	public ClienteException() {

	}

	public ClienteException(String txt) {
		super(txt);
	}

	public ClienteException(Exception e) {
		super(e);
	}

}
