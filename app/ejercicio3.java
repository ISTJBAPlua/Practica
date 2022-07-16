// Ejercicio 3 - Aplicación que me permita verificar que un número sea multiplo de 7 - Lunes, 20 de Junio del 2022
package app;

public class ejercicio3 {

    public static void main(String[] args) {
        //ENTRADA
        int numero = 7;
        int residuo = 0;
        
        //PROCESO
        residuo = numero % 7;
        
        //SALIDA
        if (residuo == 0) {
            System.out.println("El número es multiplo de 7");
        } else {
            System.out.println("El número no es multiplo de 7");
        }
    }
}
