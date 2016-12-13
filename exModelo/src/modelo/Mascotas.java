package modelo;


public class Mascotas extends Articulo implements SerVivo{
	
	
	
	public Mascotas(long codigo, String descripcion, int existencias, Fecha fechaNacimiento) {
		super(codigo, descripcion, existencias);
		FechaNacimiento = fechaNacimiento;
	}

	Fecha FechaNacimiento;

	public Fecha getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	
	public String cumpleaños(){
		String mesTexto;
		switch (FechaNacimiento.getMes()){
		case 1: mesTexto = "Enero";break;
		case 2: mesTexto = "Febrero";break;
		case 3: mesTexto = "Marzo";break;
		case 4: mesTexto = "Abril";break;
		case 5: mesTexto = "Mayo";break;
		case 6: mesTexto = "Junio";break;
		case 7: mesTexto = "Julio";break;
		case 8: mesTexto = "Agosto";break;
		case 9: mesTexto = "Septiembre";break;
		case 10: mesTexto = "Octubre";break;
		case 11: mesTexto = "Noviembre";break;
		case 12: mesTexto = "Diciembre";break;
		default: mesTexto="";
		}
		return FechaNacimiento.getDia() + "de" + mesTexto;
	}
	
	
	
}
