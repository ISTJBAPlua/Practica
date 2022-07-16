// Ejercicio 1 - Calculadora - Jueves, 16 de Junio del 2022
package app;

public class ejercicio1 {

    public static void main(String[] args) {
        //ENTRADA
        int numero1 = 20;
        int numero2 = 10;
        int suma = 0;
        int resta = 0;
        int multiplicacion = 0;
        int division = 0;

        //PROCESO
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;

        //SALIDA
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
