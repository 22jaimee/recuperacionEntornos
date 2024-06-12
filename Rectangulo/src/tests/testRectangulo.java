package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Rectangulo;

class testRectangulo {
	static private Rectangulo r1;
	static private Rectangulo r2;

	@BeforeAll
	static void init () {
		r1 = new Rectangulo(3,2);
		r2 = new Rectangulo(5,7);
	}
	
	@Test
	void testArea1() {
		int areaEsperada = 6;
		int areaObtenida = r1.area();
		assertEquals(areaEsperada,areaObtenida);
	}
	
	@Test
	void testArea2() {
		int areaEsperada = 35;
		int areaObtenida = r2.area();
		assertEquals(areaEsperada,areaObtenida);
	}
	
	@Test
	void testPerimetro1() {
		int perimetroEsperado = 10;
		int perimetroObtenido = r1.perimetro();
		assertEquals(perimetroEsperado,perimetroObtenido);
	}
	
	@Test
	void testPerimetro2() {
		int perimetroEsperado = 24;
		int perimetroObtenido = r2.perimetro();
		assertEquals(perimetroEsperado,perimetroObtenido);
	}
	
	@Test
	void testRectanguloExcepcion1() {
		Exception excepcion = assertThrows(IllegalArgumentException.class, () -> new Rectangulo(0,0));
		//Exception excepcion2 = assertThrows(IllegalArgumentException.class, () -> r1.area());
		String mensajeEsperado = "La base y la altura deben ser superiores a 0";
		String mensajeObtenido = excepcion.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}

}
