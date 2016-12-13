package modelo;


public class Mascotas extends Articulo implements SerVivo{
	private Fecha fechaNacimiento;
	
	public Mascotas(long codigo, String descripcion, int existencias, Fecha fechaNacimiento) {
		super(codigo, descripcion, existencias);
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@Override
	public void modificar(Articulo articulo) {
		super.modificar(articulo);
		if(!(articulo instanceof Mascotas)) {
			return;
		}
		Mascotas mascotas = (Mascotas) articulo;
		this.fechaNacimiento = mascotas.fechaNacimiento;
	}

	@Override
	public String toString() {
		return super.toString() + ", fecha de nacimiento: " + fechaNacimiento + ", celebramos su cumplea�os el " + cumplea�os();
	}

	@Override
	public String cumplea�os() {
		return fechaNacimiento.getDia() + " de " + fechaNacimiento.getMesNombre();
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}	
}
	
