/*
 13- Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
 */
package java_p4_arreglos_vectores;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Guia_Ejercicio_13_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de integrantes del equipo: ");
        int cant = leer.nextInt();
        String equipo[] = new String [cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese nombre: ");
            equipo [i] = leer.nextLine();
        }
        for (String elemento: equipo) {
            System.out.println(elemento);
        }
    }
}
