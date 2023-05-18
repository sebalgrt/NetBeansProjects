/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class AhorcadoService {
    Scanner leer = new Scanner(System.in);
    Ahorcado nuevo = new Ahorcado();
//Metodo crearJuego(): le pide la palabra al usuario y cantidad de
//jugadas máxima. Con la palabra del usuario, pone la longitud de la
//palabra, como la longitud del vector. Después ingresa la palabra en el
//vector, letra por letra, quedando cada letra de la palabra en un índice
//del vector. Y también, guarda la cantidad de jugadas máximas y el
//valor que ingresó el usuario.
    public void crearJuego() {
        System.out.print("Ingrese la palabra oculta: ");
        String palabra = leer.next();
        System.out.print("Ingrese cantidad de intentos: ");
        nuevo.setIntentos(leer.nextInt());
        String[] vector = new String [palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = palabra.substring(i, i + 1);
        }
        nuevo.setPalabra(vector);
    }
    
//Método longitud(): muestra la longitud de la palabra que se debe
//encontrar. Nota: buscar como se usa el vector.length.
    public void longitud() {
        System.out.println("La palabra tiene " + nuevo.getPalabra().length + " letras"); 
    }
    
//Método buscar(letra): este método recibe una letra dada por el
//usuario y busca si la letra ingresada es parte de la palabra o no.
//También informará si la letra estaba o no.
    public String buscar() {
        System.out.print("Ingrese letra a buscar: ");
        String letra = leer.next();
        boolean esta = false;
        for (int i = 0; i < nuevo.getPalabra().length; i++) {
            if (nuevo.getPalabra()[i].equalsIgnoreCase(letra)) {
                esta = true;
                break;
            }
        }
        if (esta == true) {
            System.out.println("La palabra contiene la letra '" + letra + "'");
        }else {
            System.out.println("La palabra NO contiene la letra '" + letra + "'");
        }
        return letra;
    }
    
//Método encontradas(letra): que reciba una letra ingresada por el
//usuario y muestre cuantas letras han sido encontradas y cuántas le
//faltan. Este método además deberá devolver true si la letra estaba y
//false si la letra no estaba, ya que, cada vez que se busque una letra
//que no esté, se le restará uno a sus oportunidades.    
    public boolean encontradas(String letra) {
        int cont = 0;
        for (int i = 0; i < nuevo.getPalabra().length; i++) {
            if (nuevo.getPalabra()[i].equals(letra)) {
                cont++;
            }
        }
        nuevo.setEncontradas(nuevo.getEncontradas() + cont);
        int restan = nuevo.getPalabra().length - nuevo.getEncontradas();
        System.out.println("Restan encontrar " + restan + " letras");
        return cont != 0;
    }
    
//Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
    public int intentos(boolean encontradas) {
        if (encontradas == false) {
            nuevo.setIntentos(nuevo.getIntentos() - 1);
        }
        int intentos = nuevo.getIntentos();
        System.out.println("Le quedan " + intentos + " intentos");
        return intentos;
    }
    
//Método juego(): el método juego se encargará de llamar todos los
//métodos previamente mencionados e informará cuando el usuario
//descubra toda la palabra o se quede sin intentos. Este método se
//llamará en el main.
    public void juego(){
        crearJuego();
        longitud();
        System.out.println("_________________________________");
        boolean gano = false;
        do {
            intentos(encontradas(buscar()));
            if (nuevo.getEncontradas() == nuevo.getPalabra().length) {
                System.out.println("GANASTE!!!");
                gano = true;
            }
            System.out.println("_________________________________");
        } while (nuevo.getIntentos() != 0 && gano != true);
        if (gano == false) {
            System.out.println("PERDISTE, ya no quedan intentos");
        }
    }   
}
