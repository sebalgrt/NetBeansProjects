/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_g13_excepciones_ejercicio_2;

/**
 *
 * @author Seba
 */
public class Array {
    private int[] vector = new int [5];
    
    public int[] llenar() {
        for (int i = 0; i < 10; i++) {
            try {
                vector[i] = i + 1;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Índice fuera de rango");
            }
        }
        System.out.println("");
        return vector;
    }
    
    public void mostrar(int[] vector) {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(vector[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Índice fuera de rango");
            }
        }
    }
}
