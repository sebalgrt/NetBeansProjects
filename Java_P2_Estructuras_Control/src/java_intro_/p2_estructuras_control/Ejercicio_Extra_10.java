/*
 Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package java_intro_.p2_estructuras_control;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_Extra_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10);
        //int num2 = (int) (Math.random() * 0.1);
        //int res = num1 * num2;
        int num;
        do {
            System.out.print("Ingrese número: ");
            num = leer.nextInt();
            if (num == num1) {
                System.out.println("CORRECTO!");
                //break;
            }else {
                System.out.println("INCORRECTO...");
            }
        } while (num != num1);
       
    }
    
}
