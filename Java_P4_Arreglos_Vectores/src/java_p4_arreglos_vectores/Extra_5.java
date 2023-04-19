/*
 Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 */
package java_p4_arreglos_vectores;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Extra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese cantidad de filas: ");
        int i = leer.nextInt();
        System.out.print("Ingrese cantidad de columnas: ");
        int j = leer.nextInt();
        int [][]matriz = new int [i][j];
        int suma = 0;
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                matriz[k][l] = (int) (Math.random() * 10);
                suma += matriz[k][l];
            }
        }
        for (int []fila: matriz) {
            for (int elem: fila) {
                System.out.print(elem + " ");
            }
            System.out.println("");
        }
        System.out.println("La suma de los elementos es: " + suma);
    }
}
    

