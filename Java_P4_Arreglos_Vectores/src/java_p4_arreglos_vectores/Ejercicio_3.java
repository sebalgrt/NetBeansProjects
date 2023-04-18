/*
 Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package java_p4_arreglos_vectores;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese cantidad de elementos: ");
        int cant = leer.nextInt();
        int vector [] = new int [cant];
        for (int i = 0; i < cant; i++) {
            vector[i] = (int) (Math.random() * 100000);
        }
        for (int elem: vector) {
            System.out.println(elem);
        }
        int  cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        for (int i = 0; i < cant; i++) {
            if (vector[i] < 9) {
                cont1++;
            }else if (vector[i] > 10 && vector[i] < 99) {
                cont2++;
            }else if (vector[i] > 100 && vector[i] < 999) {
                cont3++;
            }else if (vector[i] > 1000 && vector[i] < 9999) {
                cont4++;
            }else if (vector[i] > 10000 && vector[i] < 99999) {
                cont5++;
            }
        }
        System.out.println("Números de 1 cifra: " + cont1);
        System.out.println("Números de 2 cifra: " + cont2);
        System.out.println("Números de 3 cifra: " + cont3);
        System.out.println("Números de 4 cifra: " + cont4);
        System.out.println("Números de 5 cifra: " + cont5);
    }
    
}
