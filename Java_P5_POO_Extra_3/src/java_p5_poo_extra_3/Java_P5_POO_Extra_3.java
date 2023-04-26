/*
 Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
 */
package java_p5_poo_extra_3;

import java.util.Scanner;

/**
 *
 * @author recepcal
 */
public class Java_P5_POO_Extra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String rta;
        int cont = 0, ok = 0;
        do {
            cont++;
            System.out.print("Ingrese número a adivinar: ");
            Juego num1 = new Juego(leer.nextInt());
            num1.iniciarJuego();
            if (num1.iniciarJuego() == true) {
                ok++;
            }
            System.out.print("Seguir jugando? (S/N): ");
            rta = leer.next();
        } while (rta.equalsIgnoreCase("S"));
        System.out.println("Jugados: " + cont);
        System.out.println("Ganados: " + ok);
        System.out.println("Perdidios: " + (cont - ok));
    }
    
}
