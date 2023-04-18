/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package java_p4_arreglos_vectores;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] vector = new int[8];
        //int [][] matriz = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int [][] matriz = new int [3][3];
        int num;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print("Ingrese número [" + i + "][" + j + "]: ");
                    num = leer.nextInt();
                    if (num >= 0 && num <= 10) {
                        matriz[i][j] = num;
                    }else {
                        System.out.println("Número incorrecto");
                    }
                } while (num < 0 || num > 10);
            }
        }
        System.out.println("");
        for (int [] fila: matriz) {
            for (int elem: fila) {
                System.out.print(elem + " ");
            }
            System.out.println("");
        }
        vector[0] = sumar(matriz[0][0], matriz[0][1], matriz[0][2]);
        vector[1] = sumar(matriz[1][0], matriz[1][1], matriz[1][2]);
        vector[2] = sumar(matriz[2][0], matriz[2][1], matriz[2][2]);
        vector[3] = sumar(matriz[0][0], matriz[1][0], matriz[2][0]);
        vector[4] = sumar(matriz[0][1], matriz[1][1], matriz[2][1]);
        vector[5] = sumar(matriz[0][2], matriz[1][2], matriz[2][2]);
        vector[6] = sumar(matriz[0][0], matriz[1][1], matriz[2][2]);
        vector[7] = sumar(matriz[2][0], matriz[1][1], matriz[0][2]);
       
        boolean comp = true;
        for (int i = 0; i < 6; i++) {
            if (vector[i] != vector[i + 1]) {
                comp = false;
                break;
            }
        }
        System.out.println("");
        if (comp == true) {
            System.out.println("La matriz es mágica");
        }else {
            System.out.println("La matriz no es mágica");
        }
    }
    public static int sumar (int n1, int n2, int n3){
        int suma;
        suma = n1 + n2 + n3;
        return suma;
    }    
    
}
