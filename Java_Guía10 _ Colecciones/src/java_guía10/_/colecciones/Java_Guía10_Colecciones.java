/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_guía10._.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Seba
 */
public class Java_Guía10_Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
//      MANOS A LA OBRA – DETECCIÓN DE ERRORES
//      Corrige el siguiente código:
        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> lista = new TreeSet();
        HashMap<Integer, String> personas = new HashMap();
        
//      EJERCICIO COLECCIONES
//      Toma la Lista, el Conjunto y el Mapa del ejemplo
//      y agrega 5 objetos a cada uno
        //LISTAS
        ArrayList<Integer> numerosA = new ArrayList();
        for (int i = 0; i < 5; i++) {
            numerosA.add(i);
        }
        //System.out.println(numerosA.size());
        //CONJUNTOS
        HashSet<Integer> numerosB = new HashSet();
        for (int i = 0; i < 5; i++) {
            numerosB.add(i);
        }
        //System.out.println(numerosB.size());
        //MAPAS
        HashMap<Integer, String> alumnos = new HashMap();
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese nombre: ");
            String nombre = leer.next();
            System.out.print("Ingrese DNI: ");
            int dni = leer.nextInt();
            alumnos.put(dni, nombre);
        }
        //System.out.println(alumnos.size());
        
//      Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de 
//      cada forma que aprendiste arriba
        numerosA.remove(2);
        numerosB.remove(3);
        alumnos.remove(0);
//        System.out.println(numerosA.size());
//        System.out.println(numerosB.size());
//        System.out.println(alumnos.size());
        
//      PARA MOSTRAR ARRAYLIST O HASHSETS RECORREMOS CON FOR EACH
        // FOR EACH ARRAYLIST (VARIABLE AUXILIAR VACIA DEL MISMO TIPO QUE EL ARRAYLIST
        for (Integer listaA : numerosA){
            System.out.println(listaA);
        }
        System.out.println("");
        // FOR EACH HASHSET (VARIABLE AUXILIAR VACIA DEL MISMO TIPO QUE EL HASHSET
        for (Integer conjuntoB : numerosB) {
            System.out.println(conjuntoB);
        }
        //MAPAS: entry.getKey (llave), entry.getValue (valor)
        for (Map.Entry<Integer, String> entrada : alumnos.entrySet()) {
            System.out.println("DNI: " + entrada.getKey() + " - Nombre: " + entrada.getValue());
            
        }
        //SIN Map.Entry
        //SOLO LLAVES
        for (Integer dni : alumnos.keySet()) {
            System.out.println("DNI: " + dni);
        }
        //SOLO NOMBRES
        for (String nombre : alumnos.values()) {
            System.out.println("Nombre: " + nombre);
        }
        
//        MANOS A LA OBRA – DETECCIÓN DE ERRORES
        HashMap<String, String> persona = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        persona.put(n1, n2);
        for (Map.Entry<String, String> entrada : persona.entrySet()) {
            System.out.println("Nombre: " + entrada.getKey() + " - Apellido: " + entrada.getValue());
        }
    }
}
