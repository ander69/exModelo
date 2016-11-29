package modelo;

import java.io.Serializable;

public class Fecha implements Serializable {
	int dia,mes,a�o;

	public Fecha(int dia, int mes, int a�o) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	public Fecha() {
		super();
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
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
		if (a�o != other.a�o)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}
		
	public int compare(Fecha fecha) {		
		if(a�o < fecha.a�o) {
			return -1;
		} else if(a�o > fecha.a�o) {
			return 1;
		} else {
			if(mes < fecha.mes) {
				return -1;
			} else if(mes > fecha.mes) {
				return 1;
			} else {
				if(dia < fecha.dia) {
					return -1;
				} else if(dia > fecha.dia) {
					return 1;
				} else {
					return 0;
				}
			}
		}
	}
	@Override
	public String toString() {
		return dia+"/"+mes+"/"+a�o;
	}
		
}


