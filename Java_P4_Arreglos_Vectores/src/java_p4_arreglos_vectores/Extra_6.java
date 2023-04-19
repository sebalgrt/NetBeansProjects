/*
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
 */
package java_p4_arreglos_vectores;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Extra_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [][]matriz = new String[20][20];
        String palabra, relleno;
        int x;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                x = (int)(Math.random() * 10);
                relleno = String.valueOf(x);
                matriz[i][j] = relleno;
            }
        }
        int i, j, cant;
        for (int k = 0; k < 5; k++) {
            do {
                System.out.print("Ingrese palabra (3-5 caracteres): ");
                palabra = leer.nextLine();
                if (palabra.length() < 3 || palabra.length() > 5) {
                    System.out.println("Cantidad de caracteres incorrecto");
                    System.out.println("Ingrese palabra nuevamente");
                }else {
                    i = (int)(Math.random() * 20);
                    j = (int)(Math.random() * 15);
                    cant = palabra.length();
                    for (int l = 0; l < cant; l++) {
                        matriz[i][l + j] = palabra.substring(l, l + 1);
                    }
                }
            } while (palabra.length() < 3 && palabra.length() > 5);
        }
        System.out.println("");
        for (String [] fila: matriz) {
            for (String elemento: fila) {
                System.out.print(elemento + " ");
            }
            System.out.println("");
        }
    }
    
}
