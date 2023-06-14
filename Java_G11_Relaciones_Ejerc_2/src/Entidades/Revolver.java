/*
Clase Revolver de agua: esta clase posee los siguientes atributos: 
posición actual (posición del tambor que se dispara, puede que esté el agua o no)
y posición agua (la posición del tambor donde se encuentra el agua).
Estas dos posiciones, se generarán aleatoriamente.
 */
package Entidades;

/**
 *
 * @author Seba
 */
public class Revolver {
    private int actual;
    private int agua;

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    @Override
    public String toString() {
        return "Revolver | Actual: " + actual + ", Agua: " + agua;
    }
    
}
