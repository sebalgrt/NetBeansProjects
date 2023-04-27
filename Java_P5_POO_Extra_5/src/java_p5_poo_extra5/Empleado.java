/*
 Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
 */
package java_p5_poo_extra5;

import java.util.Scanner;

/**
 *
 * @author Lichi y Fran
 */
public class Empleado {
    String nombre;
    int edad;
    double salario;

    public Empleado() {
    }
    
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public void calcularAumento() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        nombre = leer.next();
        System.out.print("Ingrese edad: ");
        edad = leer.nextInt();
        System.out.print("Ingrese salario: ");
        salario = leer.nextDouble();
        double calc;
        if (edad > 30) {
            calc = salario * 0.10;
            System.out.println("Corresponde un aumento del 10%: " + calc);
        }else {
            calc = salario * 0.05;
            System.out.println("Corresponde un aumento del 5%: " + calc);
        }
    }
    
}
