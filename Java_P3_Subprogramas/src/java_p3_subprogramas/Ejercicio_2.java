/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_p3_subprogramas;

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
        Scanner leer = new Scanner (System.in);
        String resp;
        do {
            System.out.print("Ingrese nombre: ");
            String nombre = leer.next();
            System.out.print("Ingrese edad: ");
            int edad = leer.nextInt();
            info(nombre, edad);
            System.out.print("Continua ingresando? (S/N): ");
            resp = leer.next();
        } while (!resp.equalsIgnoreCase("N"));
    }
   
    public static void info(String nombre, int edad){
        System.out.println(nombre + " tiene " + edad + " años.");
        if (edad < 18) {
            System.out.println("Aun es menor de edad.");
        }else {
            System.out.println("Es mayor de edad.");
        }
       
    }
    
}
