/*
 Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector
 */
package java_p4_arreglos_vectores;

/**
 *
 * @author Seba
 */
public class Extra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vector [] = new int [10];
        for (int i = 0; i < 10; i++) {
            vector[i] = numero();
        }
        imprimir(vector);
        System.out.println("");
    }
   
    public static int numero(){
        int num = (int) (Math.random()*10);
        return num;
    }
   
    public static void imprimir(int vector []){
        for (int element: vector) {
            System.out.print(element + " ");
        }
    }
    
}
