/*
 Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas 
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y 
los atributos del padre.  
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public final class Oficinas extends Edificio {
    private String nombre;
    private Integer oficinas;
    private Integer perXofi;
    private Integer pisos;

    public Oficinas() {
    }

    @Override
    public void crear() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        nombre = leer.next();
        super.crear();
        System.out.print("Ingrese cantidad de oficinas: ");
        oficinas = leer.nextInt();
        System.out.print("Ingrese cantidad de personas por oficina: ");
        perXofi = leer.nextInt();
        System.out.print("Ingrese cantidad de pisos: ");
        pisos = leer.nextInt();
    }

    @Override
    public int calcularSuperficie() {
        int resp = super.calcularSuperficie() * pisos;
        System.out.println("La superficie es de: " + resp);
        return resp;
    }

    @Override
    public int calcularVolumen() {
        int resp = super.calcularVolumen() * pisos;
        System.out.println("El volumen es de: " + resp);
        return resp;
    }
    
    public void  cantPersonas() {
        System.out.println("Total de personas por piso: " + oficinas * perXofi);
        System.out.println("Total de personas en el edificio: " + oficinas * perXofi * pisos);
    }

    
    
}
