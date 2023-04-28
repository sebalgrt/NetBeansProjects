/*
 Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo
 */
package java_p5_poo_extras_6;

import java.util.Scanner;

/**
 *
 * @author Lichi y Fran
 */
public class Rectangulo {
    int lado1;
    int lado2;

    public Rectangulo() {
    }

    public Rectangulo(int Lado1, int Lado2) {
        this.lado1 = Lado1;
        this.lado2 = Lado2;
    }
    
    public void calcularArea() {
//        Scanner leer = new Scanner(System.in);
//        System.out.print("Ingrese lado 1: ");
//        lado1 = leer.nextInt();
//        System.out.print("Ingrese lado 2: ");
//        lado2 = leer.nextInt();
        System.out.println("El area es: " + (lado1 * lado2));
    }
    
}
