package edu.uniandes.ecos.psp2.controlador;

import java.io.FileNotFoundException;
import java.util.Scanner;

import edu.uniandes.ecos.psp2.modelo.Persistencia;
import edu.uniandes.ecos.psp2.vista.Presentacion;
/**
	* Programa 4 desarrollado para calcular rangos de tamaño de un programa
	* ECOS Primer Semestre de 2017
	*
	* @author  Daniel Melgarejo
**/
public class Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Por favor ingrese la ruta del archivo a analizar");
		String ruta = in.nextLine();
		Persistencia datos = new Persistencia();
		Lector lector = new Lector(datos);
		try {
			lector.leerArchivo(ruta);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		datos.calcularRangos();
		//Impresion de resultados
		Presentacion.mostrarResultados(datos);
	}
}
