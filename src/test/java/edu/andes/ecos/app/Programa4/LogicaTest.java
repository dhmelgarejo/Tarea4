package edu.andes.ecos.app.Programa4;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import edu.uniandes.ecos.psp2.modelo.Logica;
import junit.framework.TestCase;

public class LogicaTest extends TestCase {
	public List<Double> listaDatos1(){
		List<Double> listaNegativos = new ArrayList<Double>();
		listaNegativos.add((double) 6);
		listaNegativos.add((double) 6);
		listaNegativos.add((double) 8.3);
		listaNegativos.add((double) 10.3);
		listaNegativos.add((double) 12.3);
		listaNegativos.add((double) 16.4);
		listaNegativos.add((double) 20.5);
		return listaNegativos;
	}
	public List<Double> listaDatos2(){
		List<Double> listaNegativos = new ArrayList<Double>();
		listaNegativos.add((double) 21.75);
		listaNegativos.add((double) 22.25);
		listaNegativos.add((double) 23);
		listaNegativos.add((double) 28.3);
		listaNegativos.add((double) 29);
		listaNegativos.add((double) 5.85);
		return listaNegativos;
	}
	public List<Double> listaDatos3(){
		List<Double> listaNegativos = new ArrayList<Double>();
		listaNegativos.add((double) 7);
		listaNegativos.add((double) 12);
		listaNegativos.add((double) 10);
		listaNegativos.add((double) 12);
		listaNegativos.add((double) 10);
		listaNegativos.add((double) 12);
		listaNegativos.add((double) 12);
		listaNegativos.add((double) 12);
		listaNegativos.add((double) 12);
		return listaNegativos;
	}
	public List<Double> listaDatos4(){
		List<Double> listaNegativos = new ArrayList<Double>();
		listaNegativos.add((double) 8);
		listaNegativos.add((double) 8);
		listaNegativos.add((double) 8);
		listaNegativos.add((double) 20);
		listaNegativos.add((double) 14);
		listaNegativos.add((double) 18);
		listaNegativos.add((double) 12);
		return listaNegativos;
	}


	@Test
	public void testLogaritmo() {
		assertEquals(1.791759469228055, Logica.calcularLogaritmo(6.0),0.001);
		assertEquals(2.1162555148025524, Logica.calcularLogaritmo(8.3),0.001);
		assertEquals(2.33214389523559, Logica.calcularLogaritmo(10.3),0.001);
		assertEquals(2.509599262378372, Logica.calcularLogaritmo(12.3),0.001);
		assertEquals(2.797281334830153, Logica.calcularLogaritmo(16.4),0.001);
		assertEquals(3.0204248861443626, Logica.calcularLogaritmo(20.5),0.001);
		assertEquals(3.079613757534693, Logica.calcularLogaritmo(21.75),0.001);
	}
	
	@Test
	public void testPromedio() {
		List<Double> listaDatos1 = listaDatos1();
		List<Double> listaDatos2 = listaDatos2();
		List<Double> listaDatos3 = listaDatos3();
		List<Double> listaDatos4 = listaDatos4();

		assertEquals(11.400000000000002, Logica.calcularPromedio(listaDatos1),0.001);
		assertEquals(21.691666666666666, Logica.calcularPromedio(listaDatos2),0.001);
		assertEquals(11.0, Logica.calcularPromedio(listaDatos3),0.001);
		assertEquals(12.571428571428571, Logica.calcularPromedio(listaDatos4),0.001);
	}
	
	@Test
	public void testVarianza() {
		List<Double> listaDatos1 = listaDatos1();
		List<Double> listaDatos2 = listaDatos2();
		List<Double> listaDatos3 = listaDatos3();
		List<Double> listaDatos4 = listaDatos4();

		assertEquals(29.626666666666665, Logica.calcularVarianza(listaDatos1, Logica.calcularPromedio(listaDatos1)),0.001);
		assertEquals(70.01341666666667, Logica.calcularVarianza(listaDatos2, Logica.calcularPromedio(listaDatos2)),0.001);
		assertEquals(3.0, Logica.calcularVarianza(listaDatos3, Logica.calcularPromedio(listaDatos3)),0.001);
		assertEquals(24.952380952380953, Logica.calcularVarianza(listaDatos4, Logica.calcularPromedio(listaDatos4)),0.001);
	}
	
	@Test
	public void testDesviacionEstandar() {
		assertEquals(5.443038367186719, Logica.calcularDesviacionEstandar(29.626666666666665),0.001);
		assertEquals(8.367402026116988, Logica.calcularDesviacionEstandar(70.01341666666667),0.001);
		assertEquals(1.7320508075688772, Logica.calcularDesviacionEstandar(3.0),0.001);
		assertEquals(4.995235825502231, Logica.calcularDesviacionEstandar(24.952380952380953),0.001);
	}

	
	@Test
	public void testCalcularLOCMetodos() {
		assertEquals(6.0, Logica.calcularLOCMetodos(18.0,3.0),0.001);
		assertEquals(8.3333, Logica.calcularLOCMetodos(25.0,3.0),0.001);
		assertEquals(10.3333, Logica.calcularLOCMetodos(31.0,3.0),0.001);
		assertEquals(16.4, Logica.calcularLOCMetodos(82.0,5.0),0.001);
	}
	
}
