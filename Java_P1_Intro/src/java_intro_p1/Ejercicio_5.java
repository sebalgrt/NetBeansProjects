/*
 Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
 */
package java_intro_p1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num;
        num = read.nextInt();
        System.out.println("El doble del número ingresado es: " + num * 2);
        System.out.println("El triple del número ingresado es: " + num * 3);
        System.out.println("La raiz cuadrada del número ingresado es: " + sqrt(num));
    }
    
}
