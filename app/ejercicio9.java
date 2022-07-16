// Ejercicio 9 - aplicación que permita validar en lugar de votación, edad, la mesa de un proceso de elecciones. - Lunes, 27 de Junio del 2022
package app;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {

    }
}

 
        /*
        //ENTRADA
        String Nombre = "Andy";
        boolean Lugar = false;
        boolean Edad = false;
        boolean Mesa = true;

        //PROCESO
        if (Lugar == true) {
                    System.out.println(Nombre + " Estas en el lugar correcto de votación!");
            if (Edad == true) {
                    System.out.println(Nombre + " Tienes la edad para la votación!");
                if (Mesa == true) {
                    System.out.println(Nombre + " Puedes votar!");
                } else {
                    System.out.println(Nombre + " no cumples con la edad Para votar");
                }
            } else {
                System.out.println(Nombre + " el lugar en el que estas es incorrecto");
            }
        } else {
            System.out.println(Nombre + " la mesa en el que estas no es la correcta");
        }
    }
}*/
/* CICLO FOR
        //ENTRADA
        int variable = 0;

        //PROCESO
        System.out.println("\n---------------------------------------------------------------\n");
        System.out.println("Positivo:\n");
        for (variable = 0; variable < 21; variable += 2) {

            //SALDIA
            System.out.println("Número: " + variable);
        }

        System.out.println("\n---------------------------------------------------------------");
        System.out.println("\nNegativo:\n");
        for (variable = 0; variable > -21; variable -= 2) {

            //SALIDA
            System.out.println("Número:" + variable);
        }
    }

}
 */

 /* ciclo while
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número:");

        try {
            numero = entrada.nextInt();
            while ((numero % 5) != 0) {
                numero++;
            }
            System.out.println("La decena superior es: " + numero);
        } catch (Exception e) {
            System.out.println("Número no válido");
        }
    }
}
 */
 /* ciclo do-while
int variable = 5;
		do {
			System.out.println(variable);
			variable++;
		} while (variable <= 10);
	}
}
 */
 /*ciclo do-while
int numero = 1234567912;
        int contador = 0;
        do {
            numero /= 10;
            System.out.println(numero);
            contador++;
        } while (numero != 0);
        System.out.println("El número tiene " + contador + " dígitos");
    }

 */
