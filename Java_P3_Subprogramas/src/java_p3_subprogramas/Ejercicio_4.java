/*
 Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
 */
package java_p3_subprogramas;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("Ingrese un número: ");
        int num = leer.nextInt();
        comprovacion(num);
    }
   
    public static void comprovacion(int num){
        int cont = 0;
        for (int i = 1; i < 100; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            System.out.println(num + " es primo.");
        }else {
            System.out.println(num + " no es primo.");
        }
    }
    
}
