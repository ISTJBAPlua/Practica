// Ejercicio 14 - Convertir variable chart - Martes, 5 de Julio del 2022
package app;
import javax.swing.JOptionPane;
public class ejercicio14 {

    public static void main(String[] args) {
String palabra ="";
int longitud=0;
int contadorVocales=0;
int contadorConsonantes=0;
palabra=JOptionPane.showInputDialog("Ingresa la Palabra");

longitud = palabra.length();
for(int indice=0; indice<longitud; indice++){
if(palabra.charAt(indice)== 'a' || palabra.charAt(indice) == 'e' || palabra.charAt(indice) =='i' || palabra.charAt(indice)== 'o' ||palabra.charAt(indice) == 'u'){
contadorVocales ++;
}else{
contadorConsonantes++;
}
}
JOptionPane.showMessageDialog(null,"La cantidad de vocales es: + contadorVocales");
JOptionPane.showMessageDialog(null,"La cantidad de consonante es: + contadorConsonantes");
    }
    
}
