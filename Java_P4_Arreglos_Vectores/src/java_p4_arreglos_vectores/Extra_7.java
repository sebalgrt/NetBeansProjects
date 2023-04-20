/*
 Realizar un programa que complete un vector con los N primeros
números de la sucesión de Fibonacci. Recordar que la sucesión de
Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a
él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente
fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una
función que reciba como parámetro el valor de “n” y que calcule la serie
hasta llegar a ese valor.
 */
package java_p4_arreglos_vectores;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Extra_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese número: ");
        int num = leer.nextInt();
        if (num == 1) {
            System.out.println("f': 1");
        }else {
            int cant = fibo(num) + 1;
            int []vector = new int [cant];
            vector[0] = 1;
            int n1 = 1, n2, aux = 0;
            for (int i = 1; i < cant; i++) {
                n2 = n1 + aux;
                vector[i] = n2;
                aux = n1;
                n1 = n2;
            }
            System.out.print("f': ");
            for (int elem: vector) {
                System.out.print(elem + ", ");
            }
        }
        System.out.println("");
    }
    public static int fibo(int num){
        int n1 = 1, n2, aux = 0, cont = 0;
        for (int i = 0; i < 100; i++) {
            n2 = n1 + aux;
            aux = n1;
            n1 = n2;
            cont++;
            if (n2 > num) {
                break;
            }
        }
        return cont;
    }
}
