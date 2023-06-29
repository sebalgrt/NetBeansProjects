/*
 Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase 
edificio tendrá como métodos: 
• Método calcularSuperficie(): calcula la superficie del edificio. 
• Método calcularVolumen(): calcula el volumen del edifico.  
Estos métodos serán abstractos
 */
package java_g12_herencia_extra_2;

import Entidades.Edificio;
import Entidades.Oficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author Seba
 */
public class Java_G12_Herencia_Extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Edificio> complejo = new ArrayList();
        Edificio poli1 = new Polideportivo();
        poli1.crear();
        complejo.add(poli1);
        Edificio poli2 = new Polideportivo();
        poli2.crear();
        complejo.add(poli2);
        Edificio edi1 = new Oficinas();
        edi1.crear();
        complejo.add(edi1);
        Edificio edi2 = new Oficinas();
        edi2.crear();
        complejo.add(edi2);
        System.out.println("");
        
        int cont = 0;
        for (Edificio aux : complejo) {
            aux.calcularSuperficie();
            aux.calcularVolumen();
            System.out.println("");
            if (aux instanceof Polideportivo) {
                if (((Polideportivo) aux).isTecho()) {
                    cont++;
                }
            }else if(aux instanceof Oficinas) {
                ((Oficinas) aux).cantPersonas();
            }
        }
        System.out.println("Polideporticos techados: " + cont);
    }
    
}
