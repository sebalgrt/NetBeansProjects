/*
 clase Persona tenga como atributo nombre,
apellido y un objeto de clase Dni
 */
package Entidades;

/**
 *
 * @author Seba
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Dni dni;

    public Persona() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido + " | " + dni;
    }
    
}
