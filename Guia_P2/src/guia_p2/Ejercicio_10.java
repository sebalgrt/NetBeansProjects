/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 *
 */
package guia_p2;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        for (int i = 0; i < 4; i++) {
            do {
            System.out.print("Ingrese número: ");
            num = leer.nextInt();    
            } while (num < 1 || num > 20);          
            System.out.print(num + " ");
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

