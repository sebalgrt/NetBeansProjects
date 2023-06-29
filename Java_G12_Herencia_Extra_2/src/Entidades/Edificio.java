/*
 Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto
y largo. La clase edificio tendrá como métodos: 
• Método calcularSuperficie(): calcula la superficie del edificio. 
• Método calcularVolumen(): calcula el volumen del edifico.  
Estos métodos serán abstractos
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public abstract class Edificio {
    protected Integer ancho;
    protected Integer alto;
    protected Integer largo;

    public Edificio() {
    }
    
    public void crear() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese ancho: ");
        ancho = leer.nextInt();
        System.out.print("Ingrese alto: ");
        alto = leer.nextInt();
        System.out.print("Ingrese largo: ");
        largo = leer.nextInt();
    }
    
    public int calcularSuperficie() {
        return ancho * largo;
    }
    
    public int calcularVolumen() {
        return ancho * largo * alto;
    }

    
}
