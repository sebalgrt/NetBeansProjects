/*
 Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 */
package java_intro_.p2_estructuras_control;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_Extra_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese cantidad de muestras: ");
        int cant = leer.nextInt();
        double alt, suma = 0, sumaT = 0 ;
        int cont = 0;
        for (int i = 0; i < cant; i++) {
            System.out.print("Ingrese altura: ");
            alt = leer.nextDouble();
            sumaT = sumaT + alt;
            if (alt < 1.60) {
                suma = suma + alt;
                cont++;
            }
        }
        System.out.println("El promedio general es: " + sumaT / cant);
        System.out.println("El promedio de alturas menores a 1.6 es: " + suma / cont);
    }
    
}
