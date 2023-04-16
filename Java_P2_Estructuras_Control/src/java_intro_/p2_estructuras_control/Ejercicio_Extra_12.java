/*
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String
 */
package java_intro_.p2_estructuras_control;

/**
 *
 * @author Seba
 */
public class Ejercicio_Extra_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String r = "E";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i == 3) {
                        System.out.println(r + "-" + j + "-" + k);    
                    }else if (j == 3) {
                        System.out.println(i + "-" + r + "-" + k);
                    }else if (k == 3) {
                        System.out.println(i + "-" + j + "-" + r);
                    }else
                        System.out.println(i + "-" + j + "-" + k);
                }
            }
        }
    }
}
