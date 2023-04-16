/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */
package java_intro_.p2_estructuras_control;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Guia_Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, cont = 0, suma = 0;
        do {
            cont = cont + 1;
            System.out.print("Ingrese numero " + cont + " de 20 a sumar: ");
            num = leer.nextInt();
            if (num == 0) {
                System.out.println("Se capturó el número cero");
                break;
            }
            if (num > 0) {
                suma = num + suma;
            }
        } while (cont != 20);
        System.out.println("La suma de los números igresados es: " + suma);
    }
}