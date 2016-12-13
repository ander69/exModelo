package modelo;

import java.io.Serializable;


public class Articulo implements Serializable{

	long codigo;
	String descripcion;
	int existencias;
	
	
	
	public Articulo(long codigo, String descripcion, int existencias) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.existencias = existencias;
	}
	
	
	@Override
	public String toString() {
		return "codigo: " + codigo + ", descripcion: " + descripcion + ", existencias: " + existencias;
	}


	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getExistencias() {
		return existencias;
	}
	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}
	
	
}

