/*
 Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 */
package java_intro_.p2_estructuras_control;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_Extra_7_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese cantidad de números: ");
        int i = 0, num,  max = 0, min = 100, suma = 0;
        int cant = leer.nextInt();
        do{
            System.out.print("Ingrese número (0 a 100): ");
            num = leer.nextInt();
            i++;
            suma = suma + num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        } while (i < cant );
        System.out.println("El promedio es: " + suma / cant);
        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
    }
    
}
