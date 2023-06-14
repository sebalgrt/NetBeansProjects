/*
 Perro, que tendrá como atributos: nombre, raza, edad y tamaño
 */
package Entidades;

/**
 *
 * @author Seba
 */
public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tamano;
    private boolean disp = true;

    public Perro() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void setDisp(boolean disp) {
        this.disp = disp;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDisp() {
        return disp;
    }

    @Override
    public String toString() {
        return "Perro: " + nombre + ", " + raza + ", Edad: " + edad + ", Tamano: " + tamano;
    }

    
}
