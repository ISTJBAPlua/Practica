//Ejercicio 10 -  - Jueves, 30 de Junio del 2022
package app;

public class ejercicio10 {

    public static void main(String[] args) {
        //ENTRADA
        String Empleado = "JOSE DAVILA";
        String Cargo = "JEFE DE SISTEMA";
        double PagoHora = 15.0;
        int NumeroHoras = 160;
        double Sueldo = 0.0;
        double Iess = 0.0;
        double NetoRecibir = 0.0;
        //PROCESO
        Sueldo = PagoHora * NumeroHoras;
        Iess = Sueldo * 0.095;
        NetoRecibir = Sueldo - Iess;

        //SALIDA
        System.out.println("Empleado: " + Empleado);
        System.out.println("Cargo: " + Cargo);
        System.out.println("Sueldo: " + Sueldo);
        System.out.println("Descuento de iess: " + Iess);
        System.out.println("El neto de recibir es: " + NetoRecibir);
    }

}
