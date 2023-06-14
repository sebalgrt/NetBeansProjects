/*
 El número de jugadores será decidido por el usuario, pero 
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false
 */
package Servicios;

import Entidades.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class JugadorService {
    Scanner leer = new Scanner(System.in);
    
    public ArrayList cantJugadores() {
        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.print("Ingrese cantidad de jugadores (2 a 6): ");
        int cant = leer.nextInt();
        if (cant < 2 || cant > 6) {
            cant = 6;
            System.out.println("Jugarán 6 jugadores");
        }else {
            System.out.println("Jugarán " + cant + " jugadores");
        }
        for (int i = 0; i < cant; i++) {
            Jugador nuevo = new Jugador();
            nuevo.setId(i + 1);
            jugadores.add(nuevo);
        }
        return jugadores;
    }
    
    
}
