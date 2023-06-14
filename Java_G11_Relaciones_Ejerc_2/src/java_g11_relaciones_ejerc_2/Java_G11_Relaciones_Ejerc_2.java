/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el
juego se trata de un número de jugadores, que, con un revolver de agua, el cual
posee una sola carga de agua, se dispara y se moja. Las clases por hacer del
juego son las siguientes
 */
package java_g11_relaciones_ejerc_2;

import Entidades.Revolver;
import Servicios.JugadorService;
import Servicios.RevolverService;

/**
 *
 * @author Seba
 */
public class Java_G11_Relaciones_Ejerc_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JugadorService nuevo = new JugadorService();
        RevolverService start = new RevolverService();
        nuevo.cantJugadores();
        start.llenarRevolver();
        start.mojar();
        start.mostrar();
        start.siguienteChorro();
    }
    
}
