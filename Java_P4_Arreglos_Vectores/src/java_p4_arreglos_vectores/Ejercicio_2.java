/*
 Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package java_p4_arreglos_vectores;

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
        int vector [] = new int [10];
        for (int i = 0; i < 10; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        System.out.print("Ingrese número a buscar: ");
        int num = leer.nextInt();
        for (int elemento: vector) {
            System.out.print(elemento + " ");
        }
        System.out.println("");
               
        for (int i = 0; i < 10; i++) {
            if (vector[i] == num) {
                System.out.println("El número " + num + " está en la posición " + (i + 1));
            }
        }
    }
}
