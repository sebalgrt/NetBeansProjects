/*
 Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
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
