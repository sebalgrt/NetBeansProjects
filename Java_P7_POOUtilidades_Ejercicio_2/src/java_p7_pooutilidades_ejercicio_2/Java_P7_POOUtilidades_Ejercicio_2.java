/*
 Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números. Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
 */
package java_p7_pooutilidades_ejercicio_2;

import Servicios.ParDeNumerosServicio;

/**
 *
 * @author recepcal
 */
public class Java_P7_POOUtilidades_Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumerosServicio p1 = new ParDeNumerosServicio();
        p1.mostrarValores();
        System.out.println("El mayor es: " + p1.devolverMayor());
        p1.calcularPotencia();
        p1.calculaRaiz();
    }
    
}
