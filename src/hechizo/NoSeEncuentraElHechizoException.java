package hechizo;

public class NoSeEncuentraElHechizoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public NoSeEncuentraElHechizoException(String mensaje) {
		super(mensaje);
	}
}
