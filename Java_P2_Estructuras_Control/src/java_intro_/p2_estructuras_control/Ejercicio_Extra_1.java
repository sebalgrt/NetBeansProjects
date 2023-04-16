/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package java_intro_.p2_estructuras_control;

import static java.lang.Math.round;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese cantidad de minutos: ");
        int min = leer.nextInt();
        int dias = round(min / 1440);
        int hs = (min % 1440) / 60;
        System.out.println(min + " minutos equivalen a " + dias +  " dia y "  + hs +  " horas");
    }
    
}
