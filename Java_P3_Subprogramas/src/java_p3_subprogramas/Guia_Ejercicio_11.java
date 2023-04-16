/*
 Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
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
