/*
 Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package java_p4_arreglos_vectores;

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
        int matriz1[][] = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = (int)(Math.random()*20)- 10;
            }
        }
        for (int []fila: matriz1) {
            for (int elem: fila) {
                System.out.print(elem + "   ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        Scanner read = new Scanner(System.in);
        int matriz2[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese número de fila " + j + " columna " + i + ": ");
                matriz2[i][j] = read.nextInt() * -1;
            }
        }
        for (int []fila: matriz2) {
            for (int elem: fila) {
                System.out.print(elem + "   ");
            }
            System.out.println("");
        }
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz1[i][j] == matriz2[j][i] * (-1)) {
                    cont++;
                }  
            }
        }
        if (cont == 9) {
            System.out.println("Las matrices son antisimétricas");
        }else {
            System.out.println("Las matrices no son antisimétricas");
        }
    }
    
}
