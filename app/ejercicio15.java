//Ejercicio 15 -  - Jueves, 7 de Junio del 2022
package app;

import javax.swing.JOptionPane;

public class ejercicio15 {

    public static void main(String[] args) {
        int numero = 0;
        int opcion = 0;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("------ MENU DE OPCIONES ------" + "\n"
                + "1.- GENERA SECUENCIA ASCENDENTE" + "\n"
                + "2.- GENERA SECUENCIA DESCENDENTE"));
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));

        switch (opcion) {
            case 1:
                for (int indice = numero + 1; indice <= 10; indice++) {
                    JOptionPane.showMessageDialog(null,"Número: " + indice);
                }
                break;

            case 2:
                for (int indice = numero - 1; indice >= 0; indice--) {
                    JOptionPane.showMessageDialog(null,"Número: " + indice);
                    break;
                }
            default:
                JOptionPane.showMessageDialog(null,"Error: Digita correctamente las opciones que se visualiza");
        }

    }
}
