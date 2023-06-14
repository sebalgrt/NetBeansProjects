/*
 Crea una clase Alumnos, donde tendrá como Atributos el nombre, apellido, la nacionalidad y 
su fecha de nacimiento. La nacionalidad podrá ser ARGENTINA – CHILENA – VENEZOLANA
solamente.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Seba
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private Date nacim;
    private String nacion;
    private int legajo;

    public Alumno(String nombre, String apellido, Date nacim, String nacion, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacim = nacim;
        this.nacion = nacion;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getNacim() {
        return nacim;
    }

    public void setNacim(Date nacim) {
        this.nacim = nacim;
    }

    public String getNacion() {
        return nacion;
    }

    public void setNacion(String nacion) {
        this.nacion = nacion;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + " " + apellido + "(" + legajo + ")";
    }
    
}
