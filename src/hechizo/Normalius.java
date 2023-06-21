package hechizo;

public class Normalius extends Hechizo {

	public Normalius(String nombreDelHechizo) {
		super(nombreDelHechizo);
	}
	
	@Override
	public void aplicarHechizo(Hechizable hechizable) {
		hechizable.volverALaNormalidad();

	}

}
