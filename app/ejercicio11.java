//Ejercicio 11 -  - Jueves, 30 de Junio del 2022
package app;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        String producto = "";
        int cantidad = 0;
        double precio = 0.0;
        double subtotal = 0.0;
        double iva = 0.0;
        double total = 0.0;
    
        System.out.println("Ingrese el producto: ");
        producto = Entrada.next();
        System.out.println("Ingrese la cantidad: ");
        cantidad = Entrada.nextInt();
        System.out.println("Ingrese el precio: ");
        precio = Entrada.nextDouble();
        
        subtotal = cantidad * precio;
        iva = subtotal - 0.12;
        total = subtotal + iva;
        
        System.out.println("Producto: " + producto);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Iva: " + iva);
        System.out.println("Total: " + total);
    }

}
