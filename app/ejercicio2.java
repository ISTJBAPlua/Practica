// Ejercicio 2 - Verificar que un numero sea par-impar - Lunes, 20 de Junio del 2022
package app;

public class ejercicio2 {

    public static void main(String[] args) {
        //ENTRADA
        int numero = 4;
        int residuo = 0;

        //PROCESO
        residuo = numero % 2;

        //SALIDA
        if (residuo == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es Impar");
        }
    }

}
