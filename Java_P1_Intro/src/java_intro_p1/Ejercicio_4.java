/*
 Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es:
F = 32 + (9 * C / 5).
 */
package java_intro_p1;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int c;
        int f;
        System.out.print("Ingrese valor en ºC: ");
        c = read.nextInt();
        f = 32 + (9 * c / 5);
        System.out.println("La conversion a Fahrenheit es: " + f);
    }
    
}
