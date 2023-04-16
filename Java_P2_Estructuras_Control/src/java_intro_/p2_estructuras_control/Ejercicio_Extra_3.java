/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.

 */
package java_intro_.p2_estructuras_control;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_Extra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        String letra = leer.nextLine();
        if (letra.equalsIgnoreCase("a") || (letra.equalsIgnoreCase("e"))|| (letra.equalsIgnoreCase("i"))|| (letra.equalsIgnoreCase("o"))|| (letra.equalsIgnoreCase("u"))) {
            System.out.println("La letra " + letra + " es una vocal");
        }else {
            System.out.println("La letra " + letra + " es una consonante");
        }
    }
    
}
