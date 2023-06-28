/*
 2. Finalmente, en el main debemos realizar lo siguiente: 
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar 
el precio final de los dos electrodomésticos. 

 3. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList
de Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados. 
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los 
televisores y el de las lavadoras. Una vez hecho eso, también deberemos
mostrar, la suma del precio de todos los Electrodomésticos. Por ejemplo, si
tenemos una lavadora con un precio de 2000 y un televisor de 5000, el
resultado final será de 7000 (2000+5000) para electrodomésticos, 2000 para
lavadora y 5000 para televisor.
 */
package java_g12_herencia_ejercicio_2;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Seba
 */
public class Java_G12_Herencia_Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lavadora lav1 = new Lavadora(50, 1000.00, "ROJO", 'A', 100.00);
        Lavadora lav2 = new Lavadora(1, 1000.00, "AZUL", 'F', 10.00);
        Televisor tele1 = new Televisor(50, true, 1000.00, "NEGRO", 'A', 100.00);
        Televisor tele2 = new Televisor(32, false, 1000.00, "BLANCO", 'C', 60.00);
        ArrayList<Electrodomestico> electro = new ArrayList();
        electro.add(lav1);
        electro.add(lav2);
        electro.add(tele1);
        electro.add(tele2);
        
        double total = 0;
        for (Electrodomestico aux : electro) {
            aux.precioFinal();
            total += aux.getPrecio();
            System.out.println(aux.toString());
            System.out.println("");
        }
        System.out.println("Total $: " + total);
    }
    
}
