/*
 Realizar una clase llamada Cadena, en el paquete de entidades, que
tenga como atributos una frase (String) y su longitud. Agregar
constructor vacío y con atributo frase solamente. Agregar getters y
setters. El constructor con frase como atributo debe setear la longitud
de la frase de manera automática. Crear una clase CadenaServicio en el
paquete servicios que implemente los siguientes métodos:
 */
package java_p7_pooutilidades_ejercicio_1;

import Servicios.CadenaServicio;

/**
 *
 * @author Seba
 */
public class Java_P7_POOUtilidades_Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CadenaServicio frase = new CadenaServicio();
       frase.Ingresar();
       frase.mostrarVocales();
       frase.invertirFrase();
    }
    
}
