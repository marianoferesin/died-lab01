package guia05;

import java.util.Date;
import java.util.concurrent.TimeUnit ;

public class Alquiler  implements Contratable {
	
	Herramienta herramientaAlquilada;

    Date diaEntrega;
    Date diaDevolucionReal;
    Date diaDevolucionContratado;
    
    boolean fueDevuelta;
	
	public double calcularCosto(){
	    long diferenciaEnMilisegundos = Math.abs(diaDevolucionReal.getTime() - diaEntrega.getTime());
	    long diferenciaEnDias = TimeUnit.DAYS.convert(diferenciaEnMilisegundos, TimeUnit.MILLISECONDS);
	    
	    double costo = herramientaAlquilada.getCostoPorDia() * (double)diferenciaEnDias;
	    
	    return costo;
	}
	
	          
	public boolean enMora() {
		
		long diferenciaEnMilisegundos = diaDevolucionContratado.getTime() - diaDevolucionReal.getTime();
		
		boolean hayDemora = (diferenciaEnMilisegundos < 0);
		
		return hayDemora;
	}
	
	public boolean finalizado() {
		return fueDevuelta;
	}
}
