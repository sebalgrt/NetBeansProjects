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
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String resp;
        do {
            System.out.print("Ingrese cantidad de EUROS a convertir: ");
            double peso = leer.nextInt();
            System.out.println("Convertir a: LIBRA - DOLAR - YEN o SALIR");
            resp = leer.next();
            switch (resp) {
                case "LIBRA": libra(peso);
                continue;
                case "DOLAR": dolar(peso);
                continue;
                case "YEN": yen(peso);
                continue;
                case "SALIR": System.out.println("ADIOS!!!");
                continue;
                default: System.out.println("La opción no es válida");
            }
        }while (!resp.equalsIgnoreCase("salir"));
    }
   
    public static void libra (double peso){
        double conv = peso * 0.86;
        System.out.println(peso + " euros equivalen a: " + conv + " libras");
    }
   
    public static void dolar (double peso){
        double conv = peso * 1.28611;
        System.out.println(peso + " euros equivalen a: " + conv + " dolares");
    }
   
    public static void yen (double peso){
        double conv = peso * 129.852;
        System.out.println(peso + " euros equivalen a: " + conv + " yenes");
    }
    
}
