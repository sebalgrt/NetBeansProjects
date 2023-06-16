/*
Clase Revolver de agua: esta clase posee los siguientes atributos: 
posición actual (posición del tambor que se dispara, puede que esté el agua o no)
y posición agua (la posición del tambor donde se encuentra el agua).
Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición
del agua. Los valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el
 agua)
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

//    METODOS
    
    public void llenarRevolver() {
        actual = ((int) (Math.random() * 6 + 1));
        agua = ((int) (Math.random() * 6 + 1));
    }
    
    public boolean mojar() {
       boolean disp;
       if (actual == agua) {
           System.out.println("CAGÓ");
           disp = true;
       } else {
           System.out.println("SAFÓ");
           disp = false;
       }
       return disp;
    }
     
    public void siguienteChorro() {
       if (actual == 6) {
           actual = 1;
       } else {
           actual++;
       }
    }
    
    @Override
    public String toString() {
        return "Revolver | Actual: " + actual + ", Agua: " + agua;
    }
}
