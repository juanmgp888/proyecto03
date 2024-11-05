package es.santander.ascender.proyecto03;

//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalculadoraTest {

    /**
     Calculadora de números enteros
     */
    @Test
    // métodos con el prefijo test. @test antecediendo a cada método que vayamos a testear


    public void testSumar() {
        // llamada al constructor
        Calculadora calculadora = new Calculadora();

        long resultado = calculadora.sumar(8,3);
        assertEquals(11,resultado);

    }

    @Test
    public void testRestar() {
        // llamada al constructor
        Calculadora calculadora = new Calculadora();

        long resultado = calculadora.restar(8,3);
        assertEquals(5,resultado);
;
    }
    @Test
    public void testMultiplicar() {
        // llamada al constructor
        Calculadora calculadora = new Calculadora();

        long resultado = calculadora.multiplicar(8,3);
        assertEquals(24,resultado);
;
    }
    @Test
    public void testDividir() {
        // llamada al constructor
        Calculadora calculadora = new Calculadora();

        long resultado = calculadora.dividir(8,3);
        assertEquals(2,resultado);
;
    }
}