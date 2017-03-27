package edu.uniandes.ecos.psp2.controlador;

import java.io.FileNotFoundException;
import java.util.Scanner;

import edu.uniandes.ecos.psp2.modelo.Persistencia;
import edu.uniandes.ecos.psp2.vista.Presentacion;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;
import static spark.Spark.*;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;


/**
	* Programa 4 desarrollado para calcular rangos de tamaño de un programa
	* ECOS Primer Semestre de 2017
	*
	* @author  Daniel Melgarejo
**/
public class Principal {
	public static void main(String[] args) {
	    port(Integer.valueOf(System.getenv("PORT")));
	    staticFileLocation("/public");
	    
		Scanner in = new Scanner(System.in);
//		String ruta = "test1.txt";
//		Persistencia datos = new Persistencia();
//		Lector lector = new Lector(datos);
//		try {
//			lector.leerArchivo(ruta);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		datos.calcularRangos();
//		//Impresion de resultados
//		Presentacion.mostrarResultados(datos);
//		

		String ruta2 = "target/classes/public/test2.txt";
		Persistencia datos2 = new Persistencia();
		Lector lector2 = new Lector(datos2);
		try {
			lector2.leerArchivo(ruta2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		datos2.calcularRangos();
		//Impresion de resultados
		Presentacion.mostrarResultados(datos2);
		
		get("/", (req, res) -> datos2.getVerySmall());
	}
}
