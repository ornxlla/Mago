package hechizo;

public class Expelliarmus extends Hechizo {
	
	
	public Expelliarmus(String nombreDelHechizo) {
		super(nombreDelHechizo);
	}
	
	public void aplicarHechizo(Hechizable hechizable) {
		hechizable.desarmar();
	}
}
