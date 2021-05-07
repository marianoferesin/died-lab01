package guia05;

import java.util.Date;

public class Trabajo {
	
	String oficio;
	
	Date fechaInicio;
	Date fechaFin;
	
	boolean fueFinalizado;
	
	public boolean finalizado() {
		return fueFinalizado;
	}
	
	public String getOficio() {
		return oficio;
	}
	
	public Date getFechaInicio() {
		return fechaInicio;
	}

}
