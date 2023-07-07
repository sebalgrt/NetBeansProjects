/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_g13_excepciones_ejercicio_3._y_4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class DivisionNumero {
    private int num1;
    private int num2;
    
    public double division() {
        Scanner leer = new Scanner(System.in);
        double resultado = 0;
        do {
            try {
                System.out.print("Ingrese dividendo: ");
                String d1 = leer.next();
                num1 = Integer.parseInt(d1);
                System.out.print("Ingrese divisor: ");
                String d2 = leer.next();
                num2 = Integer.parseInt(d2);
                resultado = num1 / num2;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese números enteros");
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese solo números");
            } catch (ArithmeticException e) {
                System.out.println("Error: No es posible dividir por 0");
            }
             catch (Exception e) {
                System.out.println("Error de sistema");
            }
        } while (resultado == 0);
        return resultado;
    }
}
