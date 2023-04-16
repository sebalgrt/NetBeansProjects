/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package java_intro_.p2_estructuras_control;

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
        Scanner leer = new Scanner(System.in);
        int max, num, suma = 0;
        do {
            System.out.print("Ingrese valor límite: ");
            max = leer.nextInt();    
        } while (max < 1);
        for (int i = 0; suma < max; i++) {
            System.out.print("Ingrese número a sumar: ");
            num = leer.nextInt();
            suma = num + suma;
        }
    }
}
