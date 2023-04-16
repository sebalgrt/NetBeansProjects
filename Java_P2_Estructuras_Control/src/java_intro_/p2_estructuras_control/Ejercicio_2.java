/*
 2. Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java
 */
package java_intro_.p2_estructuras_control;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String pass;
        System.out.print("Ingrese palabra: ");
        pass = leer.nextLine();
        if (pass.equals("eureka")) {
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");
        }
    }
    }