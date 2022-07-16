//Ejercicio 18 -  - Viernes, 8 de Junio del 2022
package app;

import javax.swing.JOptionPane;

public class ejercicio18 {

    public static void main(String[] args) {
        // ENTRADA
        String celular = "";
        int longitud = 0;

//PROCESO
        celular = JOptionPane.showInputDialog("Ingrese su número celular correctamente: ");
        longitud = celular.length();
        for (int indice = 0; indice < longitud; indice++) {

//VALIDACIÓN
            if (celular.charAt(indice) != '0' || celular.charAt(indice) != '1' || celular.charAt(indice) != '2' || celular.charAt(indice) != '3' || celular.charAt(indice) != '4' || celular.charAt(indice) != '5' || celular.charAt(indice) != '6' || celular.charAt(indice) != '7' || celular.charAt(indice) != '8' || celular.charAt(indice) != '9') {

//ROMPE EL CICLO
            } else {
                JOptionPane.showMessageDialog(null, "El número ingresado no esta correcto.");
                indice = longitud;
            }
        }
    }
}
