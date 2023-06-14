/*
 La clase Dni tendrá como atributos la serie (carácter) y número.
 */
package Entidades;

/**
 *
 * @author Seba
 */
public class Dni {
    private char serie;
    private long numero;

    public Dni() {
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Dni: " + serie + "-" + numero;
    }
    
}
