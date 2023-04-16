/*
 *Escribir un programa que pida dos números enteros por teclado y calcule
 *la suma de los dos. El programa deberá después mostrar el resultado de
 *la suma
 */
package java_intro_p1;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1, num2, suma;
        System.out.print("Ingrese el primer número: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = leer.nextInt();
        suma = num1 + num2;
        System.out.println("El resultado de la suma es: " + suma);
    }
    
}
