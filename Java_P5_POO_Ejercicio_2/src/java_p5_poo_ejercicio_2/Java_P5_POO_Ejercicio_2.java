/*
 Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).

 */
package java_p5_poo_ejercicio_2;

import Objeto.Circunferencia;

/**
 *
 * @author Lichi y Fran
 */
public class Java_P5_POO_Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia circulo = new Circunferencia(10);
        circulo.crearCircunferencia();
        System.out.println(circulo.area());
        System.out.println(circulo.perimetro());
    }
    
}
