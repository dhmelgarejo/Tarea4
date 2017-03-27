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
		String ruta = "target/classes/public/test1.txt";
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
		
		get("/", (req, res) -> 
			"<h2>Expected Values</h2>"+
			"<table border='1'><th></th>"+
			"<th>VS</th>"+
			"<th>S</th>"+
			"<th>M</th>"+
			"<th>L</th>"+
			"<th>VL</th>"+
			"<tr><td>LOC/Method</td>"+
			"<td>"+datos.getVerySmall()+"</td>"+
			"<td>"+datos.getSmall()+"</td>"+
			"<td>"+datos.getMedium()+"</td>"+
			"<td>"+datos.getLarge()+"</td>"+
			"<td>"+datos.getVeryLarge()+"</td>"+
			"</tr><tr><td>Pgs/Chapter</td>"+
			"<td>"+datos2.getVerySmall()+"</td>"+
			"<td>"+datos2.getSmall()+"</td>"+
			"<td>"+datos2.getMedium()+"</td>"+
			"<td>"+datos2.getLarge()+"</td>"+
			"<td>"+datos2.getVeryLarge()+"</td>"+
			"</tr></table>"
		);
	}
}
