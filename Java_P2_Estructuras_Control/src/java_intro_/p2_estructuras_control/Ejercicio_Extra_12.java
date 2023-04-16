/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
