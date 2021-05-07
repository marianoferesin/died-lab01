package guia05;

import java.util.ArrayList;

public class Usuario {
	
	ArrayList <Contratable> contratados;
	
	public void Contratar(Contratable servicioOAquilerAContratar) throws AlquilerNoEntregadoException{
		
		if(servicioOAquilerAContratar instanceof Alquiler) {
			int cantidadAlquileresDemorados = 0;
			
			for(Contratable contratado: contratados) {
				if(contratado instanceof Alquiler && ((Alquiler) contratado).enMora()) {
					cantidadAlquileresDemorados++;
				}
			}
			
			if(cantidadAlquileresDemorados <= 2) {
				contratados.add(servicioOAquilerAContratar);
			}
			else {
				throw new AlquilerNoEntregadoException("El usuario ya tiene mas de dos herramientas sin devolver");
			}
			
		}
		else if(servicioOAquilerAContratar instanceof Servicio) {
			contratados.add(servicioOAquilerAContratar);
		}
		
		
	}
}
