// Ejercicio 17 -  - Viernes,8 de Julio del 2022
package app;

import javax.swing.JOptionPane;

public class ejercicio17 {

    public static void main(String[] args) {
        //ENTRADA
        String palabra = "";
        int longitud = 0;
        String palabraNueva = "";

//PROCESO
        palabra = JOptionPane.showInputDialog("Ingrese una palabra: ");
        longitud = palabra.length();
        for (int indice = longitud - 1; indice >= 0; indice--) {
//Armamos la nueva palabra
            palabraNueva = palabraNueva + palabra.charAt(indice);
        }

//SALIDA
        if (palabra.equals(palabraNueva)) {
            JOptionPane.showMessageDialog(null, "Es Polindroma");
        } else {
            JOptionPane.showMessageDialog(null, "No es Palindroma");

        }

    }
}
