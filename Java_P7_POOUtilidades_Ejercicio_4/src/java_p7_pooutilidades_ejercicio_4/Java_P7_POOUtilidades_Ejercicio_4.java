/*
 Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
 */
package java_p7_pooutilidades_ejercicio_4;

import Servicios.FechaService;

/**
 *
 * @author Seba
 */
public class Java_P7_POOUtilidades_Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaService fecha = new FechaService();
        System.out.println(fecha.FechaActual());
        System.out.println("La edad es: " + fecha.Diferencia(fecha.FechaNacimiento(), fecha.FechaActual()));
    }
}
