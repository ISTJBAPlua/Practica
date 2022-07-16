//Ejercicio 19 -  - Viernes, 8 de Junio del 2022
package app;

import javax.swing.JOptionPane;

public class ejercicio19 {

    public static void main(String[] args) {
        //ENTRADA
        int numero = 18;
        int antecesores = 0;
        int residuo = 0;
        int contadorDivisibles = 0;

//PROCESO
        antecesores = numero - 1;
        while (antecesores > 1) {
            if (numero % antecesores == 0) {
                contadorDivisibles++;
            }
            antecesores--;
        }

//VALIDAR SI ES PRIMO
        if (contadorDivisibles == 0) {
            JOptionPane.showMessageDialog(null, "Es Primo");
        } else {
            JOptionPane.showMessageDialog(null, "No es Primo");
        }
    }

}
