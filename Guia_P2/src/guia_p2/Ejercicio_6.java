/*
 Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
 */
package guia_p2;

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
        int num1, num2;
        System.out.print("Ingrese un número: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese otro número: ");
        num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25) {;
        System.out.println("Ambos números son mayores a 25");
        }else { ;
        System.out.println("Alguno de los números es menor a 25");
        }
            
        }
    }

