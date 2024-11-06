package es.santander.ascender.proyecto03;
// Calculadora de números enteros
public class Calculadora {
    public long sumar(long sumando1, long sumando2) {
        return sumando1 + sumando2;
    }

    public long restar(long substraendo, long minuendo) {
        return substraendo - minuendo;
    }

    public long multiplicar(long factor1, long factor2) {
        return factor1 * factor2;
    }

    public long dividir(long dividendo, long divisor) {
        return dividendo / divisor;
    }
    public long dividirPorCero(long dividendo, long divisor) {
        return dividendo / 0;
    }

    // Tabla de multiplicar de un número dado (del 0 al 10 , ambos incluidos)
    public void presentarTablaMultiplicar(int numero){
        // la variable del objeto se definió arriba: calculadora
        for (int i=0;i<=10;i++)
        {
            System.out.println(i*numero);
           // System.out.println(i+" * "+numero+" = "+(i*numero));
        }
    }
}
