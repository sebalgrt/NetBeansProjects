/*
 clase Persona con atributos: nombre, apellido, edad, documento y Perro
 */
package Entidades;

/**
 *
 * @author Seba
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private long dni;
    private Perro perro;

    public Persona() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido + ", Edad: " + edad + ", DNI: " + dni + " | " + perro;
    }
    
}
