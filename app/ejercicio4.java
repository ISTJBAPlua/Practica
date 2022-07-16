// Ejercicio 4 - Aplicación que valide que dos números son pares - Lunes, 20 de Junio del 2022
package app;

public class ejercicio4 {

    public static void main(String[] args) {
        //ENTRADA
        int numero1 = 2;
        int numero2 = 22;
        int residuo1 = 0;
        int residuo2 = 0;

        //PROCESO
        residuo1 = numero1 % 2;
        residuo2 = numero2 % 2;

        //SALIDA
        if (residuo1 == 0 && residuo2 == 0) {
            System.out.println("Los dos números son par");
        } else {
            System.out.println(" Los dos números son pares ");

        }
    }

}
