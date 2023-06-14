/*
 Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición
del agua. Los valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el
 agua)
 */
package Servicios;

import Entidades.Revolver;

/**
 *
 * @author Seba
 */
public class RevolverService {
    Revolver juego = new Revolver();
    
    public void llenarRevolver() {
        juego.setActual((int) (Math.random() * 6 + 1));
        juego.setAgua((int) (Math.random() * 6 + 1));
    }

    public void mojar() {
        if (juego.getActual() == juego.getAgua()) {
            System.out.println("CAGASTE");
        } else {
            System.out.println("SAFASTE");
        }
    }

    public void siguienteChorro() {
        if (juego.getActual() == 6) {
            juego.setActual(1);
        } else {
            juego.setActual(juego.getActual() + 1);
        }
    }

    public void mostrar() {
        System.out.println(juego.toString());
    }
    
    
}
