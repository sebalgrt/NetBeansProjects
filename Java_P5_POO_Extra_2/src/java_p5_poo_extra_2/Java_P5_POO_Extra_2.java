/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
package java_p5_poo_extra_2;

/**
 *
 * @author recepcal
 */
public class Java_P5_POO_Extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Puntos p1yp2 = new Puntos();
          p1yp2.crearPuntos();
          System.out.println("La distancia entre puntos es: " + p1yp2.calculo());
    }
    
}
