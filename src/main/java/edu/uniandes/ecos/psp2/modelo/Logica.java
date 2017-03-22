package edu.uniandes.ecos.psp2.modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Clase con metodos estaticos auxiliares para calcular varaibles de regresion lineal
 * @author Melga
 *
 */
public class Logica {
	
	/**
	 * Calcula el promedio a partir de una lista de datos
	 * @param datos
	 * @return
	 */
	public static double calcularPromedio(List<Double> datos){
		double respuesta = 0;
		for (Double temp : datos) 
			respuesta += temp;
		return respuesta/datos.size();
	}
	
	/**
	 * Calcula la sumatoria de una lista de datos	
	 * @param datos
	 * @return
	 */
	public static double calcularSumatoria(List<Double> datos){
		double respuesta = 0;
		for (Double temp : datos) 
			respuesta += temp;
		return respuesta;
	}

	/**
	 * Calcula la sumatoria de una serie de datos elevada al cuadrado, usa metodo calcularSumatoria
	 * @param datos
	 * @return
	 */
	public static double calcularSumatoriaAlCuadrado(List<Double> datos){
		List<Double> datosNuevos = new LinkedList<Double>();
		for (Double temp : datos) 
			datosNuevos.add(Math.pow(temp, 2));
		
		return calcularSumatoria(datosNuevos);
	}

	/**
	 * Calcula el logaritmo de un datos	
	 * @param datos
	 * @return
	 */
	public static double calcularLogaritmo(Double dato){
		return Math.log(dato);
	}


	/**
	 * Calcula la variancia de una serie logaritmica de datos 
	 * frente al promedio de los mismos
	 * @param datos
	 * @return
	 */
	public static double calcularVarianza(List<Double> datos, double promedio){
		List<Double> operacion = new ArrayList<Double>();
		for (int i = 0; i < datos.size(); i++) {
			operacion.add(datos.get(i)-promedio);
		}
		return calcularSumatoriaAlCuadrado(operacion)/(datos.size()-1);
	}

	/**
	 * Calcula la desviacion estandar de una varianza	
	 * @param datos
	 * @return
	 */
	public static double calcularDesviacionEstandar(double varianza){
		return Math.sqrt(varianza);
	}


	/**
	 * Calcula los rangos logaritmicos (Desde muy pequeño hasta muy grande)
	 * En base a la varianza ingresada
	 * @param datos
	 * @return Arreglo de datos con los rangos calculados
	 */
	public static double[] calcularRangosLogaritmicos(double desviacionEstandar, double promedio){
		double[] rangos = new double[5];
		rangos[0] = promedio - 2*desviacionEstandar; 	// Very Small
		rangos[1] = promedio - desviacionEstandar;	// Small
		rangos[2] = promedio;				// Medium
		rangos[3] = promedio + desviacionEstandar;	// Large
		rangos[4] = promedio + 2*desviacionEstandar;	// Very Large
		return rangos;
	}
	
	/**
	 * Calcula los rangos numericos originales para los rangos
	 * (Desde muy pequeño hasta muy grande) logaritmicos encontrados
	 * @param datos
	 * @return Arreglo de datos con los rangos calculados
	 */
	public static double[] calcularRangosOriginales(double[] datos){
		double[] rangos = new double[5];
		rangos[0] = Math.exp(datos[0]);	// Very Small
		rangos[1] = Math.exp(datos[1]);	// Small
		rangos[2] = Math.exp(datos[2]);	// Medium
		rangos[3] = Math.exp(datos[3]);	// Large
		rangos[4] = Math.exp(datos[4]);	// Very Large
		return rangos;
	}
	
	/**
	 * Calcula la division entre numero de lineas y numero de metodos
	 * @param datos
	 * @return
	 */
	public static double calcularLOCMetodos(double lineas, double metodos){
		return lineas / metodos;
	}
	
}
