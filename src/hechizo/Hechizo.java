package hechizo;


import java.util.Objects;

public abstract class Hechizo {
	protected String nombreDelHechizo;
	
	public Hechizo(String nombreDelHechizo) {
		this.nombreDelHechizo = nombreDelHechizo;
	}
	
	public String getNombreDelHechizo() {
		return nombreDelHechizo;
	}

	public void setNombreDelHechizo(String nombreDelHechizo) {
		this.nombreDelHechizo = nombreDelHechizo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(nombreDelHechizo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hechizo other = (Hechizo) obj;
		return Objects.equals(nombreDelHechizo, other.nombreDelHechizo);
	}


	public abstract void aplicarHechizo(Hechizable hechizable);
}
