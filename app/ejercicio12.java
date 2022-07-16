// Ejercicio 12 -  - Lunes, 4 de Julio del 2022
package app;

import javax.swing.JOptionPane;

public class ejercicio12 {

    public static void main(String[] args) {
        //ENTRADA
        String NumeroEnteroString ="10";
        String NumeroDecimalString ="5.5";
        int NumeroEnteroConvertido = 0;
        double NumeroDecimalConvertido = 0.0;
        
        //PROCESO
        NumeroEnteroConvertido = Integer.parseInt(NumeroEnteroString);
        NumeroDecimalConvertido = Double.parseDouble(NumeroDecimalString);
        
        //SALIDA
        JOptionPane.showMessageDialog(null,"El numero entero convertido entero" + NumeroEnteroConvertido);
    }
    
}
