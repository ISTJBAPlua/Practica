// Ejercicio 16 - Aplicación que me permita ingresar una palabra y presentar caracter por caracter las letras que lo componen. - Viernes,8 de Julio del 2022
// Utilizando Do - While
package app;

import javax.swing.JOptionPane;

public class ejercicio16 {

    public static void main(String[] args) {
//ENTRADA
        String palabra = "";
        int longitud = 0;
        int indice = 0;

//PROCESO
        palabra = JOptionPane.showInputDialog("Ingrese una palabra");
        longitud = palabra.length();
        do {
            JOptionPane.showMessageDialog(null, palabra.toUpperCase().charAt(indice));
            indice++;
        } while (indice < longitud);
    }
}
