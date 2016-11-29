package modelo;

import java.io.Serializable;

public class Fecha implements Serializable {
	int dia,mes,año;

	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
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
		if (año != other.año)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}
		
	public int compare(Fecha fecha) {		
		if(año < fecha.año) {
			return -1;
		} else if(año > fecha.año) {
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
		return dia+"/"+mes+"/"+año;
	}
		
}


