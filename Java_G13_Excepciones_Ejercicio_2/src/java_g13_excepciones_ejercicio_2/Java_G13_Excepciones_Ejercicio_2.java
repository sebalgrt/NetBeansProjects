/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el
código para generar y capturar una excepción ArrayIndexOutOfBoundsException
(índice de arreglo fuera de rango).
 */
package java_g13_excepciones_ejercicio_2;

/**
 *
 * @author Seba
 */
public class Java_G13_Excepciones_Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Array n1 = new Array();
        int[] vector = n1.llenar();
        n1.mostrar(vector);
    }
    
}
