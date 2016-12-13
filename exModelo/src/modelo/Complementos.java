package modelo;


public class Complementos extends Articulo {
	private Fecha fechaCaducidad;
	
	public Complementos(long codigo, String descripcion, int existencias,Fecha fechacaducidad){
		super(codigo, descripcion, existencias);
		this.fechaCaducidad = fechacaducidad;
	}

	public Fecha getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Fecha fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "Complementos fechaCaducidad=" + fechaCaducidad ;
	}
	@Override
	public void modificar(Articulo articulo) {
		super.modificar(articulo);
		if(!(articulo instanceof Complementos)) {
			return;
		}
		Complementos complementos = (Complementos) articulo;
		this.fechaCaducidad = complementos.fechaCaducidad;
	}

}
