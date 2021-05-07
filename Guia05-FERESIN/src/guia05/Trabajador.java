package guia05;


import java.util.ArrayList;

public class Trabajador {
	double plus;
	ArrayList<Trabajo> trabajos;
	String oficio;
	
	public double getPlus() {
		return plus;
	}
	
	public void agreagarTarea(Trabajo trabajo) throws OficioNoCoincideException,AgendaOcupadaException {
		
		boolean realizaTarea = (trabajo.getOficio() == this.oficio);
		
		boolean estaOcupado = false;
		for(Trabajo trabajoAceptado: trabajos) {
			if(trabajoAceptado.getFechaInicio().getTime() == trabajo.getFechaInicio().getTime()) estaOcupado = true;
		}
		
		if(realizaTarea && !estaOcupado) {
			trabajos.add(trabajo);
		}
		else {
			if(!realizaTarea){
				throw new OficioNoCoincideException("El trabajador no realiza el tipo de tarea que se le quiso asignar");
			}
			else {
				throw new AgendaOcupadaException("El trabajador tiene un trabjo asignado el día que se le quiso asignar");
			}
		}
	}
	

}

