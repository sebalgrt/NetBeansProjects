/*
Clase Jugador: esta clase posee los siguientes atributos:
id (representa el número del jugador), 
nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y 
mojado (indica si está mojado o no el jugador). 
El número de jugadores será decidido por el usuario, pero 
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
 */
package Entidades;

/**
 *
 * @author Seba
 */
public class Jugador {
    private int id;
    private final String nombre = "Jugador";
    private boolean mojado = false;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
}
