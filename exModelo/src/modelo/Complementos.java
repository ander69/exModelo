package modelo;


public class Complementos extends Articulo{
	Fecha FechaCaducidad;

	public Complementos(long codigo, String descripcion, int existencias, Fecha fechaCaducidad) {
		super(codigo, descripcion, existencias);
		FechaCaducidad = fechaCaducidad;
	}

	public Fecha getFechaCaducidad() {
		return FechaCaducidad;
	}

	public void setFechaCaducidad(Fecha fechaCaducidad) {
		this.FechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "FechaCaducidad: " + FechaCaducidad;
	}
	
	
	
}
