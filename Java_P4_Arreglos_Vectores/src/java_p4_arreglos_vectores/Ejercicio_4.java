/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).

 */
package java_p4_arreglos_vectores;

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
        Scanner leer = new Scanner(System.in);
        int matriz1[][] = new int [4][4];
        //RELLENO ALEATORIAMENTE
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz1[i][j] = (int)(Math.random()*10);
            }
        }
        //MUESTRO
        for (int[]fila: matriz1) {
            for (int elem: fila) {
                System.out.print(elem + " ");
            }
            System.out.println("");
        }
        //CREO MATRIZ 2, LEVANTO LOS DATOS DE LA MATRIZ 1 Y TRASPONGO
        int matriz2[][] = new int [4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz2[i][j] = matriz1[j][i];
            }
        }
        System.out.println("");
        System.out.println("TRASPUESTA ->");
        //IMPRIMO MATRIZ2 (TRASPUESTA)
        for (int[]fila: matriz2) {
            for (int elem: fila) {
                System.out.print(elem + " ");
            }
            System.out.println("");
        }
    }
    
}
