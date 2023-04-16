/*
 Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
¿Aún no lo entendiste? Recomendamos googlear división con restas
sucesivas.
 */
package java_intro_.p2_estructuras_control;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio_Extra_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese dividendo: ");
        int dividendo = leer.nextInt();
        System.out.print("Ingrese divisor: ");
        int divisor = leer.nextInt();
        int resultado = 0, resto;
        do {
          resto = dividendo - divisor;
          dividendo = resto;
          resultado++;
        } while (resto > divisor);
        System.out.println("El resultados es: " + resultado);
        System.out.println("El resto es: " + resto);
    }
    
}
