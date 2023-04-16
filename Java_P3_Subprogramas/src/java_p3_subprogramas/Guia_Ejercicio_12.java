/*
 Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
 */
package java_p3_subprogramas;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Guia_Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese número: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese número: ");
        int num2 = leer.nextInt();
        multiplos(num1, num2);
    }
    public static void multiplos(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("Los números son multiplos");
        }else {
            System.out.println("Los números no son multiplos");
        }
    }
    
}
