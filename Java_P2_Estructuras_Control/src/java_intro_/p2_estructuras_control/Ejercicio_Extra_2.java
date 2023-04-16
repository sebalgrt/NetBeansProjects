/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package java_intro_.p2_estructuras_control;


/**
 *
 * @author Seba
 */
public class Ejercicio_Extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = (int) (Math.random() * 10);
        int B = (int) (Math.random() * 10);
        int C = (int) (Math.random() * 10);
        int D = (int) (Math.random() * 10);
        
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        System.out.println("");
        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        
        
    }
    
}
