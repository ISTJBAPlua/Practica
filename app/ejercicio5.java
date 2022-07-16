// Ejercicio 5 - Aplicación que permita validar el listado de invitados de una fiesta. - Martes, 21 de Junio del 2022
package app;

public class ejercicio5 {

    public static void main(String[] args) {
        /* //ENTRADA
        String nombre1 = "CARLOS";
        String nombre2 = "MARCOS";
        
        //PROCESO
        if( nombre1 == "CARLOS" || nombre2 == "MARCOS"){
        
        //SALIDA
            System.out.println( "Tiene acceso a la fiesta" );
        }else{
            System.out.println( "No tiene acceso a la fiesta" );
        }
       
    }
    
}*/
        //ENTRADA
        String nombre1 = "LUIS";
        int edad = 15;

        //PROCESO
        if (edad >= 18 && edad <= 30) {

        //SALIDA
            System.out.println(nombre1 + "Tiene acceso a la fiesta");
        } else {
            System.out.println(nombre1 + "No tiene acceso a la fiesta");
        }
    }
}
