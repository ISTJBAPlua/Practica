// Ejercicio 13 - Convertir variable chart - Martes, 5 de Julio del 2022
package app;

import java.awt.Menu;
import javax.swing.JOptionPane;

public class ejercicio13 {

    public static void main(String[] args) {
        
                //ENTRADA
        char sexo = 'M';
        String NumeroEnteroString ="10";
        String NumeroDecimalString ="5.5";
        int NumeroEnteroConvertido = 0;
        double NumeroDecimalConvertido = 0.0;
        String sexoStringConvertido="";
        int option = 0;
        
        option = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu de optiones" + "\n" + "1.-Convertidor de String a entero" + "\n" + "2.- Convertir String a Double"+ "\n" +"3.- Convertir un char en Strin"));
        if(option==1){
            NumeroEnteroConvertido=Integer.parseInt(NumeroEnteroString);
            JOptionPane.showMessageDialog(null,"La conversion es: "+NumeroEnteroConvertido);
        }else if (option==2){
            NumeroDecimalConvertido=Double.parseDouble(NumeroDecimalString);
            JOptionPane.showMessageDialog(null,"La conversion es: "+NumeroDecimalConvertido);
        }else if ((option==3)){
            sexoStringConvertido = String.valueOf(sexo);
            JOptionPane.showMessageDialog(null,"La conversion es: "+sexoStringConvertido);
        }
        
    }
    
}
