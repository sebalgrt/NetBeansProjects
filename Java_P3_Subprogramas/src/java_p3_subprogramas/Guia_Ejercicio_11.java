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
public class Guia_Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese frase: ");
        String frase  = leer.nextLine();
        System.out.println(conversion(frase));
    }
       
    public static String conversion(String frase) {
        int cant = frase.length();
        int f = 1;
        String resp = "";
        for (int i = 0; i < cant; i++) {
            String letra = frase.substring(i,f).toLowerCase();
            switch (letra){
                case "a": letra = "@";
                break;
                case "e": letra = "#";
                break;
                case "i": letra = "$";
                break;
                case "o": letra = "%";
                break;
                case "u": letra = "*";
                break;
            }
            f++;
            resp = resp.concat(letra);
        }
        return resp;    
    }      
    
}
