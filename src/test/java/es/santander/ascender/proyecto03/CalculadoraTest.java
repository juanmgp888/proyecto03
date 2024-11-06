package es.santander.ascender.proyecto03;

//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalculadoraTest {

    /**
     Calculadora de números enteros
     */
    // llamada al constructor
    Calculadora calculadora = new Calculadora();

    @Test
    // métodos con el prefijo test. @test antecediendo a cada método que vayamos a testear
    public void testSumar() {

        long resultado = calculadora.sumar(8,3);
        assertEquals(11,resultado);
    }

    @Test
    public void testRestar() {
        long resultado = calculadora.restar(8,3);
        assertEquals(5,resultado);
    }

    @Test
    public void testMultiplicar() {
        long resultado = calculadora.multiplicar(8,3);
        assertEquals(24,resultado);
    }
    @Test
    public void testDividir() {
        long resultado = calculadora.dividir(8,3);
        assertEquals(2,resultado);
    }
    @Test
    public void testDividirPorCero() {
        try{
            long resultado = calculadora.dividir(8,0);
          //  assertEquals(2,resultado);
            fail("Debería haber lanzado un error de división por cero.");
            
        } catch (Exception e){
            // Código. Clase para tratar las excepciones.
            // El nombre de esas clases llevan por sufijo: exception
            System.out.println(e);
        }

    }

    @Test
    // Tabla de multiplicar
    public void testPresentarTablaMultiplicar(){
    // Como es void, no arroja ningún resultado. 
    // No creamos una variable para alamcenar el resultado.
    // Llamamos al método.
    // Ver resultado por la consola de debug    
        calculadora.presentarTablaMultiplicar(6);
    }

    @Test
    public void testCalcularTablaDeMultiplicar(){
        calculadora.calcularTablaMultiplicar(5);

    }
}
