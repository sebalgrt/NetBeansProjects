/*
 Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).

 */
package java_p4_arreglos_vectores;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese largo de los vectores: ");
        int cant = leer.nextInt();
        int vec1 [] = new int [cant];
        int vec2 [] = new int [cant];
        for (int i = 0; i < cant; i++) {
            System.out.print("Ingrese número para VECTOR 1 posición " + i + ": ");
            vec1[i] = leer.nextInt();
        }
        for (int i = 0; i < cant; i++) {
            System.out.print("Ingrese número para VECTOR 2 posición " + i + ": ");
            vec2[i] = leer.nextInt();
        }
        boolean cond = true;
        for (int i = 0; i < cant; i++) {
            if (vec1[i] != vec2[i]) {
                System.out.println("Los vectores son diferentes");
                cond = false;
                break;
            }
        }
        if (cond == true) {
            System.out.println("Los vectores son iguales");
        }
    }
    
}
