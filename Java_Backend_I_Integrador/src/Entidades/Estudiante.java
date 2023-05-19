/*
 Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
van a ser nombre y nota (representando la nota obtenida en el final)
 */
package Entidades;

/**
 *
 * @author Seba
 */
public class Estudiante {
    private String nombre;
    private int nota;

    public Estudiante() {
    }

    //NO ES NECESARIO UN CONSTRUCTOR POR PARAMETROS PORQUE NO INSTANCIÉ OBJETOS POR PARAMETRO EN NINGUNA OCACIÓN
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override                       //LO AGREGUE PARA CHECKEAR SI ENTRABAN LOS DATOS
    public String toString() {      //(y para ver como se usa...)
        return "Nombre: " + nombre + " - Nota: " + nota;
    }
    
}
