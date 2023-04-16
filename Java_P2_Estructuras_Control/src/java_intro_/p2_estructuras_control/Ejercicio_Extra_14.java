/*
 Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 */
package java_intro_.p2_estructuras_control;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_Extra_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0, cont = 0;
        System.out.print("Ingrese Cantidad de familias: ");
        int fam = leer.nextInt();
        for (int i = 0; i < fam; i++) {
            System.out.print("Ingrese cantidad de hijos familia " + (i + 1)+ ": ");
            int hij = leer.nextInt();
            for (int j = 0; j < hij; j++) {
                System.out.print("Ingrese edad de hijo " + (j + 1) + ": ");
                int ed = leer.nextInt();
                suma = suma + ed;
                cont++;
            }
        }
        System.out.println("El promedio de edad es: " + (suma / cont));
    }
    
}
