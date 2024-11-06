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
            System.out.println(i*numero);  // Lo habitual será un return(i*numero), creo
           // System.out.println(i+" * "+numero+" = "+(i*numero));
        }
    }
    public int[] calcularTablaMultiplicar(int numero){
      
        int[] borrame = new int[11]; // crea una variable de tipo array y crea 12 espacios
        for (int i=0;i<=10;i++){
            borrame[i]=(i*numero);
       //     System.out.println(borrame[i]);
        }
        return borrame;
    }
}
