/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas
 y después toda en minúsculas.
 */
package java_intro_p1;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase;
        frase = leer.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
