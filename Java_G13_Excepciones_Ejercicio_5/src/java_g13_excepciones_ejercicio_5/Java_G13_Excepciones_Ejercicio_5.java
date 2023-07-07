/*
Escribir un programa en Java que juegue con el usuario a adivinar un número.
La computadora debe generar un número aleatorio entre 1 y 500, y el usuario
tiene que intentar adivinarlo. Para ello, cada vez que el usuario introduce un
valor, la computadora debe decirle al usuario si el número que tiene que
adivinar es mayor o menor que el que ha introducido el usuario. Cuando 
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces
que el usuario ha intentado adivinar el número. Si el usuario introduce algo
que no es un número, se debe controlar esa excepción e indicarlo por pantalla.
En este último caso también se debe contar el carácter fallido como un intento.
 */
package java_g13_excepciones_ejercicio_5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Java_G13_Excepciones_Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int secreto = (int)(Math.random() * 500 + 1);
        int num = 0;
        int cont = 0;
        do {
            try {
                System.out.print("Ingrese número: ");
                num = leer.nextInt();
                if (num == secreto) {
                    System.out.println("ADIVINASTE!!!");
                } else if (num < secreto) {
                    System.out.println("Mas grande!");
                    cont++;
                } else if (num > secreto) {
                    System.out.println("Mas chico!");
                    cont++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese números enteros");
                cont++;
                leer.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese solo números");
                cont++;
                leer.nextLine();
            }catch (Exception e) {
                System.out.println("Error de sistema");
                cont++;
                leer.nextLine();
            }
        } while (num != secreto);
        System.out.println("Cantidad de intentos: " + cont);
    }
    
}
