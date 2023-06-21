package hechizo;

public class Objeto implements Hechizable{
 protected String estado = "";



 public void setEstado(String estado) {
	this.estado = estado;
 }

 	@Override
 		public void desarmar() {
 		this.setEstado("Me desarmaron");
	
}

 	@Override
 		public void agrandar() {
 		this.setEstado("Ahora soy mas grande");
	
}

 	@Override
 		public String getEstado() {
 			return estado;
}

	@Override
	public void volverALaNormalidad() {
		this.setEstado("Volvi a la normalidad");
		
	}
 
 
}
