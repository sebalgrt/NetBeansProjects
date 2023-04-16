/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
 */
package java_intro_.p2_estructuras_control;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_Extra_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese numero del 1 al 10: ");
        int opc = leer.nextInt();
        switch (opc){
            case 1: System.out.println(opc + " en romano es I");
            break;
            case 2: System.out.println(opc + " en romano es II");
            break;
            case 3: System.out.println(opc + " en romano es III");
            break;
            case 4: System.out.println(opc + " en romano es IV");
            break;
            case 5: System.out.println(opc + " en romano es V");
            break;
            case 6: System.out.println(opc + " en romano es VI");
            break;
            case 7: System.out.println(opc + " en romano es VII");
            break;
            case 8: System.out.println(opc + " en romano es VIII");
            break;
            case 9: System.out.println(opc + " en romano es IX");
            break;
            case 10: System.out.println(opc + " en romano es X");
            break;
        }
    }
    
}
