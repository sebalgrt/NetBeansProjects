/*
 Realizar una clase llamada Persona en el paquete de entidades que
tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’
para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro
atributo, puede hacerlo. Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3
métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje
3c) Método calcularIMCՄՅր calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2ՅՅ. Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un ՞1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
● Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
● Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.
 */
package java_p6_pooservicio_ejercicio_3;

import Servicios.PersonaServicio;

/**
 *
 * @author recepcal
 */
public class Java_P6_POOServicio_Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = new int [4][2];
        PersonaServicio persona1 = new PersonaServicio();
        persona1.crearPersona();
        persona1.esMayorDeEdad();
        if (persona1.esMayorDeEdad() == true) {
            matriz[0][0] = 1;
            System.out.println("Es mayor de edad");
        }else {
            matriz[0][0] = 0;
            System.out.println("Es menor de edad");
        }
        persona1.calcularIMC();
        matriz[0][1] = persona1.calcularIMC();
        
        PersonaServicio persona2 = new PersonaServicio();
        persona2.crearPersona();
        persona2.esMayorDeEdad();
        if (persona2.esMayorDeEdad() == true) {
            matriz[1][0] = 1;
            System.out.println("Es mayor de edad");
        }else {
            matriz[1][0] = 0;
            System.out.println("Es menor de edad");
        }
        persona2.calcularIMC();
        matriz[1][1] = persona2.calcularIMC();
        
        PersonaServicio persona3 = new PersonaServicio();
        persona3.crearPersona();
        persona3.esMayorDeEdad();
        if (persona3.esMayorDeEdad() == true) {
            matriz[2][0] = 1;
            System.out.println("Es mayor de edad");
        }else {
            matriz[2][0] = 0;
            System.out.println("Es menor de edad");
        }
        persona3.calcularIMC();
        matriz[2][1] = persona3.calcularIMC();
        
        PersonaServicio persona4 = new PersonaServicio();
        persona4.crearPersona();
        persona4.esMayorDeEdad();
        if (persona4.esMayorDeEdad() == true) {
            matriz[3][0] = 1;
            System.out.println("Es mayor de edad");
        }else {
            matriz[3][0] = 0;
            System.out.println("Es menor de edad");
        }
        persona4.calcularIMC();
        matriz[3][1] = persona4.calcularIMC();
        
        int cont = 0;
        for (int i = 0; i < 4; i++) {
            if (matriz[i][0] == 1) {
                cont++;
            }
        }
        System.out.println("");
        System.out.println("Hay " + cont + " mayores, equivalen al " + cont * 100 / 4 + "%");
        
        int bajo = 0, ideal = 0, alto = 0;
        for (int i = 0; i < 4; i++) {
            switch (matriz[i][1]){
                case -1: bajo++;
                break;
                case 0: ideal++;
                break;
                case 1: alto++;
                break;
            }
        }
        System.out.println("Hay " + bajo + " por debajo de su peso ideal (" + bajo * 100 / 4 + "%)");
        System.out.println("Hay " + ideal + " con peso ideal (" + ideal * 100 / 4 + "%)");
        System.out.println("Hay " + alto + " con sobrepeso (" + alto * 100 / 4 + "%)");
    }
    
}
