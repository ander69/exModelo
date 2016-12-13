package modelo;

import java.io.Serializable;


public class Fecha implements Serializable{
	private int dia;
	private int mes;
	private int anio;
	
	
	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	public Fecha(){
		
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return ""+dia+"/"+mes+"/"+anio+"";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		if (anio != other.anio)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

	public int comparaFechas(int anio,int mes,int dia) {
		
		if(this.anio > anio){
			return 1;
		}
		if(this.anio < anio){
			return -1;
		}else{
			if(this.mes == mes && this.dia == dia){
				return 0;
			}
		}
		return -1;
	
	}
	
}