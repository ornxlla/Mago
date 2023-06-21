package hechizo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MagoTest {

	@Test
	public void queSePuedaAgregarUnHechizoAlLibro() throws Exception {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Expelliarmus("expelliarmus");
		libro.agregarHechizo(desarme);
		assertEquals(desarme, libro.buscar("expelliarmus"));
	}

	@Test
	public void verSiUnHechizableSeDesarma() throws Exception {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Expelliarmus("expelliarmus");
		Hechizable perro = new Animal();
		libro.agregarHechizo(desarme);
		Hechizo hechizo = libro.buscar("expelliarmus");
		hechizo.aplicarHechizo(perro);
		assertEquals("Me desarmaron", perro.getEstado());
	}
	
	@Test
	public void verSiUnHechizableCrece() throws Exception {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo crecer = new Enormuvus("enormuvus");
		Hechizable mesa = new Mueble();
		libro.agregarHechizo(crecer);
		Hechizo hechizo = libro.buscar("enormuvus");
		hechizo.aplicarHechizo(mesa);
		assertEquals("Ahora soy mas grande", mesa.getEstado());
	}
	
	@Test
	public void queUnHechizableVuelvaASuEstadoNormal() throws Exception {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo crecer = new Enormuvus("enormuvus");
		Hechizable gato = new Animal();
		libro.agregarHechizo(crecer);
		Hechizo hechizo = libro.buscar("enormuvus");
		hechizo.aplicarHechizo(gato);
		assertEquals("Ahora soy mas grande", gato.getEstado());
		
		Hechizo volverALaNormalidad = new Normalius("normalius");
		libro.agregarHechizo(volverALaNormalidad);
		Hechizo hechizoDos = libro.buscar("normalius");
		hechizoDos.aplicarHechizo(gato);
		assertEquals("Volvi a la normalidad", gato.getEstado());
	}
	
	@Test
	public void queNoSePuedaAgregarUnHechizoAlLibro() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Expelliarmus("expelliarmus");
		Hechizo desarmeDos = new Expelliarmus("expelliarmus");
		Hechizo crecer = new Enormuvus ("enormuvus");
		
		libro.agregarHechizo(desarme);
		libro.agregarHechizo(desarmeDos);
		libro.agregarHechizo(crecer);
		
		Integer valorEsperado = 3;
		Integer valorObtenido = libro.hechizos.size();
		assertFalse(valorEsperado.equals(valorObtenido));
	}
	

	@Test (expected = Exception.class)
	public void queNoSeEncuentreUnHechizo() throws Exception {
		LibroDeHechizos libro = new LibroDeHechizos();
		libro.buscar("catapultis");
		
		
	}
}
