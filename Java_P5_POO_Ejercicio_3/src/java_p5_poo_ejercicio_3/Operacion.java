/*
 Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes
métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.
f) Método restar(): calcular la resta de los números y devolver el
resultado al main
g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.
 */
package java_p5_poo_ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Lichi y Fran
 */
public class Operacion {
    private double num1;
    private double num2;

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
    
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese número 1: ");
        this.setNum1(leer.nextDouble());
        System.out.print("Ingrese número 2: ");
        this.setNum2(leer.nextDouble());
    }
    
    public double sumar(){
        double suma = num1 + num2;
        return suma;
    }
    
    public double restar(){
        double resta = num1 - num2;
        return resta;
    }
    
    public double multiplicar(){
        double mult;
        if (num2 == 0) {
            mult = 0;
            System.out.println("ERROR");
        }else {
            mult = num1 * num2;
        }
        return mult;
    }
    
    public double dividir(){
        double div;
        if (num2 == 0) {
            div = 0;
            System.out.println("ERROR");
        }else {
            div = num1 / num2;
        }
        return div;
    }
}
