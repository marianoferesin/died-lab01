package guia05;

public class ServicioEstandar extends Servicio {
	Trabajador profesional;
	double montoFijo;
	
	public double calcularCosto() {
		if(esUrgente)
			return ( montoFijo + profesional.getPlus() ) * 1.5;
		else
			return montoFijo + profesional.getPlus();
	}

}
