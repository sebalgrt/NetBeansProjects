/*

f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra
ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
que devuelvan nuestros métodos y en caso de no existir solución, se
mostrará un mensaje.
 */
package Servicios;

import Entidades.Raices;

/**
 *
 * @author Seba
 */
public class RaicesServicios {
    Raices r1 = new Raices(2, 4, -1);
    
//a) Método getDiscriminante(): devuelve el valor del discriminante
//(double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    public double getDiscriminante() {
        return Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC();
    }
    
//b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
//soluciones, para que esto ocurra, el discriminante debe ser mayor o
//igual que 0.
    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }
    
//c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
//única solución, para que esto ocurra, el discriminante debe ser igual
//que 0.
    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
  }
  
//d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true,
//imprime las 2 posibles soluciones.
    public void obtenerRaices() {
        if (tieneRaices() == true) {
            double x1 = ((r1.getB() * (-1)) + Math.sqrt(Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC())) / (2 * r1.getA());
            System.out.println("X1 = " + x1);
            double x2 = ((r1.getB() * (-1)) - Math.sqrt(Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC())) / (2 * r1.getA());
            System.out.println("X2 = " + x2);
        }
    }

//e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
//una única raíz. Es en el caso en que se tenga una única solución
//posible.
    public void obtenerRaiz() {
        if (tieneRaiz() == true) {
            double x = ((r1.getB() * (-1)) + Math.sqrt(Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC())) / (2 * r1.getA());
            System.out.println("X = " + x);
        }
    }
//f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
//y mostrará por pantalla las posibles soluciones que tiene nuestra
//ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
//que devuelvan nuestros métodos y en caso de no existir solución, se
//mostrará un mensaje.
    public void calcular() {
        tieneRaices();
        tieneRaiz();
    }
}
