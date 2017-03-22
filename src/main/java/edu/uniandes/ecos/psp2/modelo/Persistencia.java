package edu.uniandes.ecos.psp2.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para almacenar en una estructora de datos las variables mas relevantes para 
 * el calculo de una regresion lineal 
 * @author Melga
 *
 */
public class Persistencia {

	// VARIABLES 
	private List<Double> datos;
	private List<Double> datosLogaritmicos;
	private double promedio;
	private double verySmall;
	private double small;
	private double medium;
	private double large;
	private double veryLarge;
	
	/**
	 * Constructor
	 * @param datosX
	 * @param datosY
	 */
	public Persistencia(){
		this.datos = new ArrayList<Double>();
		this.datosLogaritmicos = new ArrayList<Double>();
	}
	
	/**
	 * Calcula los valores de las variables en el orden necesario usando las clases de los metodos
	 * definidos en Logica.java
	 */
	public void calcularRangos(){
		for (int i = 0; i < datos.size(); i++) {
			datosLogaritmicos.add(Logica.calcularLogaritmo(datos.get(i)));
		}
		promedio = Logica.calcularPromedio(datosLogaritmicos);
		double varianza = Logica.calcularVarianza(datosLogaritmicos, promedio);
		double desviacionEstandar = Logica.calcularDesviacionEstandar(varianza);
		double rangos[] = Logica.calcularRangosLogaritmicos(desviacionEstandar, promedio);
		double rangosNormales[] = Logica.calcularRangosOriginales(rangos);
		
		this.verySmall = rangosNormales[0];
		this.small = rangosNormales[1];
		this.medium = rangosNormales[2];
		this.large = rangosNormales[3];
		this.veryLarge = rangosNormales[4];
	}

	// SETTERS Y GETTERS

	public List<Double> getDatos() {
		return datos;
	}

	public void setDatos(List<Double> datos) {
		this.datos = datos;
	}

	public double getPromedio() {
		return promedio;
	}

	public double getVerySmall() {
		return verySmall;
	}

	public double getSmall() {
		return small;
	}

	public double getMedium() {
		return medium;
	}

	public double getLarge() {
		return large;
	}

	public double getVeryLarge() {
		return veryLarge;
	}	
}
