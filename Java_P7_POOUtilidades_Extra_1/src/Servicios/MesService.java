/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Mes;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class MesService {
    Scanner leer = new Scanner(System.in);
    Mes mes = new Mes();
    public void adivina() {
        System.out.println("ADIVINE EL MES");
        System.out.println("==============");
        String adiv = "";
        do {
            System.out.print("Adivine el mes oculto: ");
            adiv = leer.next();
            if (adiv.equalsIgnoreCase(mes.getOculto())) {
                System.out.println("CORRECTO!!!");
            }else {
                System.out.println("INCORRECTO, intentelo nuevamente");
            }
        } while (!adiv.equalsIgnoreCase(mes.getOculto()));
    }
}
