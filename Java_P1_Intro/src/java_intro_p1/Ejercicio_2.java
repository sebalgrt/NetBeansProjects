/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 */
package java_intro_p1;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.print("Ingrese su nombre: ");
        nombre = leer.next();
        System.out.println("Su nombre es: " + nombre);
    }
    }