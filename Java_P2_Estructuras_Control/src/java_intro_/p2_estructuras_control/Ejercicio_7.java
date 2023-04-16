/*
 Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */
package java_intro_.p2_estructuras_control;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        int ok = 0, not = -1;
        do {
            System.out.print("Ingrese palabra: ");
            palabra = leer.nextLine();
            if (palabra.length() == 5 && palabra.substring(0, 1).equals("X") && palabra.substring(4, 5).equals("O")) {
                ok = ok + 1;
            }else {
                not = not + 1;
            }
        } while (!palabra.equals("&&&&&"));
        System.out.println("Palabras CORRECTAS " + ok);
        System.out.println("Palabras INCORRECTAS " + not);
    }
   
}
