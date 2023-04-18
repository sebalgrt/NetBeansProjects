/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario
 */
package java_p4_arreglos_vectores;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese cantidad de números a sumar: ");
        int cant = leer.nextInt();
        int vector[] = new int [cant];
        int suma = 0;
        for (int i = 0; i < cant ; i++) {
            System.out.print("Ingrese número: ");
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de los números ingresados es: " + suma);
    }
    
}
