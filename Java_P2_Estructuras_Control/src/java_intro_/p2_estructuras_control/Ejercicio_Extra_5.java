/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_intro_.p2_estructuras_control;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_Extra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
            System.out.print("Ingrese tipo de socio (A, B ó C): ");
            String tipo = leer.nextLine().toUpperCase();
            switch (tipo) {
                case "A": System.out.println("Abonan un tratamiento de " + 1500 + " con un descuento del 50%, TOTAL A ABONAR: " + 1500 * 0.5);
                break;
                case "B": System.out.println("Abonan un tratamiento de " + 1000 + " con un descuento del 35%, TOTAL A ABONAR: " + 1500 * 0.35);
                break;
                case "C": System.out.println("Abonan un tratamiento de " + 700 + " este plan no tiene descuentos");
                break;
                default: System.out.println("La opción ingresada no es válida");
            }
    }
    
}
