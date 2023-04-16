/*
 Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 */
package java_intro_.p2_estructuras_control;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_Extra_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont = 0, par = 0, impar = 0;
        for (int i = 0; i < 100; i++) {
            System.out.print("Ingrese número: ");
            int num = leer.nextInt();
            if (num % 5 == 0) {
                break;
            }
            if (num > 0 && num % 2 == 0) {
                cont++;
                par++;
            }else {
                cont++;
                impar++;
            }
        }
        System.out.println("Cantidad de números ingresados: " + cont);
        System.out.println("Cantidad de números pares: " + par);
        System.out.println("Cantidad de números impares: " + impar);
    }
    
}
