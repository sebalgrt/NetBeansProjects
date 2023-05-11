/*
 Realizar una clase llamada Cadena, en el paquete de entidades, que
tenga como atributos una frase ՄString) y su longitud. Agregar
constructor vacío y con atributo frase solamente. Agregar getters y
setters. El constructor con frase como atributo debe setear la longitud
de la frase de manera automática. Crear una clase CadenaServicio en el
paquete servicios que implemente los siguientes métodos:
 */
package java_p7_pooutilidades_ejercicio_1;

import Servicios.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author recepcal
 */
public class Java_P7_POOUtilidades_Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio nueva = new CadenaServicio();
        nueva.Ingresar();
        nueva.mostrarVocales();
        nueva.invertirFrase();
        System.out.print("Ingrese letra a buscar: ");
        String letra = leer.next();
        nueva.vecesRepetido(letra);
        System.out.print("Ingrese nueva frase: ");
        String frase = leer.next();
        nueva.compararLongitud(frase);
        nueva.unirFrases(frase);
        System.out.print("Ingrese letra que reemplazará la 'a': ");
        String letraa = leer.next();
        nueva.reemplazar(letraa);
        System.out.print("Ingrese letra a buscar: ");
        String letrab = leer.next();
        nueva.contiene(letrab);
    }
}
