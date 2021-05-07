package guia05;

public class ServicioPersonalizado extends Servicio {
	Trabajador profesional;
	double valorPresupuesto;
	double costoMateriales;
	double costoTransporte;
	
	public double calcularCosto() {
		if(esUrgente)
			return ( valorPresupuesto + costoMateriales + costoTransporte ) * 1.5;
		else
			return  valorPresupuesto + costoMateriales + costoTransporte;
	}


}
