// Ejercicio 8 -  - Jueves, 23 de Junio del 2022
package app;

public class ejercicio8 {

    public static void main(String[] args) {
        //ENTRADA
        String vehiculo = "FORD-F150";
        boolean licencia = false;
        boolean efectivo = false;

        //PROCESO
        if (licencia == true) {
            //if-anidación
            if (efectivo == true) {

                //SALIDA
                System.out.println(" Se ejecuta La venta del vehiculo: " + vehiculo);
            } else {
                System.out.println(" Cumple con la licencia, pero no cumple con el efectivo, no se ejecuta la venta ");
            }
        } else {
            System.out.println(" No cumple con el requisito princiopal (LICENCIA) ");
        }

    }

}
