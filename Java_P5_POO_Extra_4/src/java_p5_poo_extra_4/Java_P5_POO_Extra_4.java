/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.

 */
package java_p5_poo_extra_4;

/**
 *
 * @author Lichi y Fran
 */
public class Java_P5_POO_Extra_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta op = new Cuenta("Martínez", 100);
        op.retirarDinero();
    }
    
}
