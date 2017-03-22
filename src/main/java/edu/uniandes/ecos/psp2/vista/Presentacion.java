package edu.uniandes.ecos.psp2.vista;

import edu.uniandes.ecos.psp2.modelo.Persistencia;

/**
 * Clase auxiliar para mostrar resultados de forma ordenada
 * @author Melga
 *
 */
public class Presentacion {
	
	/**
	 * Metodo estatico que recibe una instancia de la persistencia de datos y realiza la impresion de las
	 * operacion entre variables para calcular los rangos de tamaño
	 * @param datos
	 */
	public static void mostrarResultados(Persistencia datos){
		System.out.println("Resultado:");
		System.out.println("Very Small: "+datos.getVerySmall());
		System.out.println("Small: "+datos.getSmall());
		System.out.println("Medium: "+datos.getMedium());
		System.out.println("Large: "+datos.getLarge());
		System.out.println("Very Large: "+datos.getVeryLarge());
	}
	
}
