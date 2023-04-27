/*
 Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
 */
package java_p5_poo_ejercicio_4;

import Objeto.Rectangulo;

/**
 *
 * @author Seba
 */
public class Java_P5_POO_Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo uno = new Rectangulo(0, 0);
        uno.datos();
        System.out.println("La superficie es: " + uno.superficie());
        System.out.println("El perimetro es: " + uno.perimetro());
        System.out.println("");
        uno.dibujo();
    }
    
}
