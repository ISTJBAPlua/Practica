//Ejercicio 20 -  - Viernes, 8 de Junio del 2022
package app;

import javax.swing.JOptionPane;

public class ejercicio20 {
    public static void main(String[] args) {
        //ENTRADA
int numero=6;
int antecesores=0;
int acumuladorDivisibles=0;

//PROCESO
antecesores=numero-1;
while(antecesores > 0 ){
if(numero%antecesores==0){
acumuladorDivisibles= acumuladorDivisibles + antecesores;
    }
}

//SALIDA
JOptionPane.showMessageDialog(null, acumuladorDivisibles);
    }
    
}
