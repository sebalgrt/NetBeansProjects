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
public class Juego {
    public int numero;

    public Juego() {
    }

    public Juego(int numero) {
        this.numero = numero;
    }
    
    public void iniciarJuego() {
        Scanner leer = new Scanner(System.in);
<<<<<<< HEAD
        boolean win = false;
=======
>>>>>>> a47730d476e0157fad5d0c59ab995cffd43a8234
        String rta;
        int cont = 0, ok = 0;
            do {
            cont++;
            System.out.print("Ingrese número a adivinar: ");
            numero = leer.nextInt();
                for (int i = 0; i < 2; i++) {
                    System.out.print("Que número es?: ");
                    int num2 = leer.nextInt();
                    if (this.numero == num2) {
                        System.out.println("CORRECTO!!!");
<<<<<<< HEAD
                        win = true;
=======
>>>>>>> a47730d476e0157fad5d0c59ab995cffd43a8234
                        ok++;
                        break;
                    }else if (this.numero < num2) {
                        System.out.println("INCORRECTO... el número es mas bajo");
                        System.out.println("Le quedan " + (1 - i) + " intentos");
                    }else {
                        System.out.println("INCORRECTO... el número es mas alto");
                        System.out.println("Le quedan " + (1 - i) + " intentos");
                    }
                }
                System.out.print("Sigue jugando? (S/N): ");
                rta = leer.next();
            } while (rta.equalsIgnoreCase("S"));
        
        System.out.println("Jugados: " + cont);
        System.out.println("Ganados: " + ok);
        System.out.println("Perdidios: " + (cont - ok));
    }
}


