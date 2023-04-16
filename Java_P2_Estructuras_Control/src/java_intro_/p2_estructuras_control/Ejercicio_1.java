/*
 Crear un programa que dado un número determine si es par o impar.
 */
package java_intro_.p2_estructuras_control;

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
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un número: ");
        num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número ingresado es par");
        }else {
            System.out.println("El número ingresado no es par");
    }
    }
    }
    
