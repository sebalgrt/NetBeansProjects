/*
 Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package java_p4_arreglos_vectores;

/**
 *
 * @author Seba
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vector[] = new int [101];
        for (int i = 0; i < 101; i++) {
            vector[i] = i;
        }
        for (int i = 100; i > -1; i--) {
            System.out.println(vector[i]);
        }
       
    }
    
}
