package com.fca.calidad;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;



public class CalculadoraTest {
private Calculadoraa miCalculadora ;
	

	@Before
	public void setup(){
		 miCalculadora = new Calculadoraa();
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
	public void multiplicaPositivosTest() {
		//Llamar al código
		float resultadoEsperado = 1;
		float resultadoEjecucion = miCalculadora.multiplica(2, 1);
		//Verificar
		assertThat(resultadoEsperado, equalTo(resultadoEjecucion));
	}
	
	@Test
	public void multiplicaConCeroTest() {
		//Llamar al código
		float resultadoEsperado = 0;
		float resultadoEjecucion = miCalculadora.suma(2,0);
	
		//Verificar
		assertThat(resultadoEsperado,equalTo(resultadoEjecucion));
	}
	
	@Test
	public void dividirPositivosTest() {
		//Llamar al código
		float resultadoEsperado = 3;
		float resultadoEjecucion = miCalculadora.divide(6, 2);
		//Verificar
		assertThat(resultadoEsperado, equalTo(resultadoEjecucion));
	}
	
	@Test
	public void dividirConCeroTest() {
		//Llamar al código
		float resultadoEsperado = 3;
		float resultadoEjecucion = miCalculadora.divide(3,0);
	
		//Verificar
		assertThat(resultadoEsperado,equalTo(resultadoEjecucion));
	}
	
	@After
	public void tearDown(){
		System.out.println("Prueba terminada!");
	}

}


