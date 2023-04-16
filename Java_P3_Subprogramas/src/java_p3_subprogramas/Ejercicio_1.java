/*
 Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package java_p3_subprogramas;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese número: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese número: ");
        int num2 = leer.nextInt();
        System.out.println("");
        int opc;
        do {
            System.out.println("Elija una operación: ");
            System.out.println("1- SUMA");
            System.out.println("2- RESTA");
            System.out.println("3- MULTIPLICACIÓN");
            System.out.println("4- DIVISIÓN");
            System.out.println("5- SALIR");
            opc = leer.nextInt();
            System.out.println("");
            switch(opc){
                case 1: suma(num1, num2);
                break;
                case 2: resta(num1, num2);
                break;
                case 3: multi(num1, num2);
                break;
                case 4: div(num1, num2);
                break;
                case 5: System.out.println("ADIOS!!!");
                break;
                default: System.out.println("La opción ingresada no es válida");
            }
        } while (opc != 5);
    } 
    
    public static int suma(int num1, int num2){
        int suma = num1 + num2;
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("");
        return suma;
    }
    
    public static int resta(int num1, int num2){
        int resta = num1 - num2;
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("");
        return resta;
    }
    
    public static int multi(int num1, int num2){
        int multi = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + multi);
        System.out.println("");
        return multi;
    }
    
   public static int div(int num1, int num2){
       int div = 0;
       if (num2 == 0) {
           System.out.println("No es pòsible dividir por 0");
           System.out.println("");
       }else {
           div = num1 / num2;
           System.out.println("El resultado de la división es: " + div);
           System.out.println("");
       }
       return div;
   }
    
}