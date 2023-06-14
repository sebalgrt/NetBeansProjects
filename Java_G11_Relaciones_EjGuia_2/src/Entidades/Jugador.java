/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Seba
 */
public class Jugador {
    private String nombre;
    private String apellido;
    private String posicion;
    private int numero;

    public Jugador() {
    }

     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     public void setApellido(String apellido) {
        this.apellido = apellido;
    }

     public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

     public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jugador: " + numero + "- " + nombre + " " + apellido + " - " + posicion;
    }

}
