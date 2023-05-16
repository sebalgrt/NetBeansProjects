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
 * @author recepcal
 */
public class CadenaServicio {
    Scanner leer = new Scanner(System.in);
    Cadena c1 = new Cadena();
    
    public void Ingresar() {
        System.out.print("Ingrese frase: ");
        c1.setFrase(leer.nextLine());
        c1.setLargo(c1.getFrase().length());
    }
    
//Método mostrarVocales(), deberá contabilizar la cantidad de vocales
//que tiene la frase ingresada.
    public void mostrarVocales() {
        int voc = 0;
        for (int i = 0; i < c1.getLargo(); i++) {
            switch (c1.getFrase().substring(i, i + 1).toUpperCase()) {
                case "A": voc++;
                break;
                case "E": voc++;
                break;
                case "I": voc++;
                break;
                case "O": voc++;
                break;
                case "U": voc++;
                break;
            }
        }
        System.out.println("La frase tiene " + voc + " vocales");
    }
    
//Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
//por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
//asac".
    public void invertirFrase() {
        String inv = "";
        for (int i = c1.getLargo(); i > 0; i--) {
            inv += c1.getFrase().substring(i - 1 , i);
        }
        System.out.println(inv);
    }
    
// Método vecesRepetido(String letra), recibirá un carácter ingresado
//por el usuario y contabilizar cuántas veces se repite el carácter en la
//frase, por ejemplo: Entrada: frase = "casa blanca". Salida: El carácter 'a'
//se repite 4 veces
    public void vecesRepetido(String letra) {
        int cont = 0;
        for (int i = 0; i < c1.getLargo(); i++) {
            if (c1.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                cont++;
            }
        }
        System.out.println("La letra " + letra + " se repite " + cont + " veces.");
    }
    
//Método compararLongitud(String frase), deberá comparar la longitud
//de la frase que compone la clase con otra nueva frase ingresada por
//el usuario.
    public void compararLongitud(String frase) {
        if (c1.getFrase().length() == frase.length()) {
            System.out.println("Las frases son igual de largas");
        }else {
            System.out.println("Las frases no son igual de largas");
        }
    }
    
//Método unirFrases(String frase), deberá unir la frase contenida en la
//clase Cadena con una nueva frase ingresada por el usuario y mostrar
//la frase resultante.
    public void unirFrases(String frase) {
        String unif = c1.getFrase().concat(frase);
        System.out.println("La frase unificada es: " + unif);
    }
    
//Método reemplazar(String letra), deberá reemplazar todas las letras
//“a” que se encuentren en la frase, por algún otro carácter
//seleccionado por el usuario y mostrar la frase resultante.
    public void reemplazar(String letraa) {
        String reemp = "";
        for (int i = 0; i < c1.getLargo(); i++) {
            if (c1.getFrase().substring(i, i + 1).equals("a")) {
                reemp += letraa;
            }else {
                reemp += c1.getFrase().substring(i, i + 1);
            }
        }
        System.out.println("Reemplazando la 'a': " + reemp);
    }
    
//Método contiene(String letra), deberá comprobar si la frase contiene
//una letra que ingresa el usuario y devuelve verdadero si la contiene y
//falso si no.
    public void contiene(String letrab) {
        for (int i = 0; i < c1.getLargo(); i++) {
            if (c1.getFrase().substring(i, i + 1).equals(letrab)) {
                System.out.println("La frase contiene la letra " + letrab);
                break;
            }else {
                System.out.println("La frase no contiene la letra " + letrab);
                break;
            }
        }
    }
}
