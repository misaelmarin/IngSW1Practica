package com.fca.calidad;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.equalTo;

public class CalculadoraTest {
		private Calculadora miCalculadora ;
	
	@Before
	public void setup(){
		 miCalculadora = new Calculadora();
	}
	

	@Test
	public void sumaPositivosTest() {
		//Llamar al código
		float resultadoEsperado = 6;
		float resultadoEjecucion = miCalculadora.suma(2, 4);
		//Verificar
		assertThat(resultadoEsperado, equalTo(resultadoEjecucion));
	}
	
	@Test
	public void sumaConCeroTest() {
		//Llamar al código
		float resultadoEsperado = 4;
		float resultadoEjecucion = miCalculadora.suma(0,4);
	
		//Verificar
		assertThat(resultadoEsperado,equalTo(resultadoEjecucion));
	}
	
	@Test
	public void multiplicacionPositivosTest() {
		//Llamar al código
		float resultadoEsperado = 10;
		float resultadoEjecucion = miCalculadora.multiplica(2, 5);
		//Verificar
		assertThat(resultadoEsperado, equalTo(resultadoEjecucion));
	}
	
	@Test
	public void multiplicacionConCeroTest() {
		//Llamar al código
		float resultadoEsperado = 0;
		float resultadoEjecucion = miCalculadora.multiplica(0,4);
	
		//Verificar
		assertThat(resultadoEsperado,equalTo(resultadoEjecucion));
	}
	
	@Test
	public void dividirPositivosTest() {
		//Llamar al código
		float resultadoEsperado = 5;
		float resultadoEjecucion = miCalculadora.divide(25, 5);
		//Verificar
		assertThat(resultadoEsperado, equalTo(resultadoEjecucion));
	}
	
	@Test
	public void restaConCeroTest() {
		//Llamar al código
		float resultadoEsperado = 5;
		float resultadoEjecucion = miCalculadora.resta(10,5);
	
		//Verificar
		assertThat(resultadoEsperado,equalTo(resultadoEjecucion));
	}
	@Test(expected = ArithmeticException.class)
	public void dividirEntreCero() {
	
	float resultadoEjecucion = miCalculadora.divide(10, 0);
	System.out.println("Ejecutando division entre cero");
	//Verificarr
			
	}
	@After
	public void tearDown(){
		System.out.println("Prueba terminada!");
	}

}

