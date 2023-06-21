package hechizo;


import java.util.HashSet;


public class LibroDeHechizos{

	protected HashSet <Hechizo> hechizos = new HashSet<Hechizo>();
	
	public HashSet<Hechizo> getHechizos() {
		return hechizos;
	}

	public void setHechizos(HashSet<Hechizo> hechizos) {
		this.hechizos = hechizos;
	}

	public void agregarHechizo(Hechizo hechizo) {
		this.hechizos.add(hechizo);
	}

	public Hechizo buscar(String nombre) throws Exception {
		for(Hechizo h :hechizos) {
			if(h.getNombreDelHechizo().equalsIgnoreCase(nombre)) {
				return h;
			}
		}
		throw new NoSeEncuentraElHechizoException("No se encuentra el hechizo " + nombre);
	}

	

}
