/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Seba
 */
public class Equipo {
    private String nombre;
    private String dt;
    private ArrayList jugadores;

    public Equipo() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public void setJugadores(ArrayList jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo: " + nombre + " DT: " + dt + " " + jugadores;
    }
    
}
