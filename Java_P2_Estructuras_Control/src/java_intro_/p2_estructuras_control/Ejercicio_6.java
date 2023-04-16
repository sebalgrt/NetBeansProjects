/*
 Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
 */
package java_intro_.p2_estructuras_control;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opc;
        String conf;
        do {
            System.out.print("Ingrese primer número: ");
            num1 = leer.nextInt();
        } while (num1 < 1);      
        do {
            System.out.print("Ingrese segundo número: ");
            num2 = leer.nextInt();
        } while (num2 < 1);
       
        do {
            System.out.println("");
            System.out.println("MENU:");
            System.out.println("1- SUMAR");
            System.out.println("2- RESTAR");
            System.out.println("3- MULTIPLICAR");
            System.out.println("4- DIVIDIR");
            System.out.println("5- SALIR");
            System.out.print("Ingrese una opción: ");
            opc = leer.nextInt();
            System.out.println("");
            
            switch (opc){
            case 1: System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            break;
            case 2: System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            break;
            case 3: System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
            break;
            case 4: System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            break;
            case 5:
                do {
                    System.out.print("Confirma salir? (S para confirmar): ");
                    conf = leer.next();
                if (conf.equalsIgnoreCase("S")) {
                    System.out.println("ADIOS!");
                    break;
                } else {
                    opc = 0;
                    break;
                }
                } while (!conf.equalsIgnoreCase("S"));
            break;
            default: System.out.println("La opción ingresada no es correcta");
            }
        } while (opc != 5);
    }
}
