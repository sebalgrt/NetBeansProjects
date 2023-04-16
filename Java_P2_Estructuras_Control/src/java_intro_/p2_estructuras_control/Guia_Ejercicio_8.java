/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package java_intro_.p2_estructuras_control;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Guia_Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese nota (0-10): ");
            int nota = leer.nextInt();
        while (nota < 0 || nota > 10){
           System.out.print("La nota no es valida, ingrese nuevamente: ");
           nota = leer.nextInt();
           }
        }
    }
