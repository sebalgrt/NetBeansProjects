/*
 Defina una clase llamada DivisionNumero. En el método main utilice un Scanner
para leer dos números en forma de cadena. A continuación, utilice el método
parseInt() de la clase Integer, para convertir las cadenas al tipo int y
guardarlas en dos variables de tipo int. Por ultimo realizar una división
con los dos numeros y mostrar el resultado. 
 */
package java_g13_excepciones_ejercicio_3._y_4;

/**
 *
 * @author Seba
 */
public class Java_G13_Excepciones_Ejercicio_3_y_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DivisionNumero cuenta = new DivisionNumero();
        double res = cuenta.division();
        System.out.println("El resultado de la division es " + res); 
    }
    
}
