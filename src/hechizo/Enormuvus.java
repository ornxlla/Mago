package hechizo;

public class Enormuvus extends Hechizo {

	public Enormuvus(String nombreDelHechizo) {
		super(nombreDelHechizo);
	}

	public void aplicarHechizo(Hechizable hechizable) {
		hechizable.agrandar();
	}

	
}
