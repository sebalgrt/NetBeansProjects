/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class CadenaServicio {
    Scanner leer = new Scanner(System.in);
    Cadena nueva = new Cadena();
    
    public void Ingresar() {
        System.out.print("Ingrese frase: ");
        nueva.setFrase(leer.nextLine());
        nueva.setLongitud(nueva.getFrase().length());
    }

//Método mostrarVocales(), deberá contabilizar la cantidad de vocales
//que tiene la frase ingresada.
    
    public void mostrarVocales() {
        int vocales = 0;
        for (int j = 0; j < nueva.getLongitud() - 1; j++) {
            switch (nueva.getFrase().substring(j, j + 1).toLowerCase()) {
                case "a": vocales++;
                break;
                case "e": vocales++;
                break;
                case "i": vocales++;
                break;
                case "o": vocales++;
                break;
                case "u": vocales++;
                break;
            }
        }
        System.out.println("La frase tiene: " + vocales + " vocales.");
        
    }
    
//Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
//por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
//asac".
    
    public void invertirFrase() {
        
    }
    
}
