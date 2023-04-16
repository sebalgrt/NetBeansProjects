/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_p3_subprogramas;

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
        Scanner leer = new Scanner (System.in);
        System.out.print("Ingrese un número: ");
        int num = leer.nextInt();
        comprovacion(num);
    }
   
    public static void comprovacion(int num){
        int cont = 0;
        for (int i = 1; i < 100; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            System.out.println(num + " es primo.");
        }else {
            System.out.println(num + " no es primo.");
        }
    }
    
}
