package modelo;

public class Complementos extends Articulo {
	Fecha fechaCaducidad;
	
	public Complementos(long codigo, String descripcion, int existencias,Fecha fechacaducidad){
		super(codigo, descripcion, existencias);
		this.fechaCaducidad = fechacaducidad;
	}

}
