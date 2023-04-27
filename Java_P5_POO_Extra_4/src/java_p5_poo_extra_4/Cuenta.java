/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.

 */
package java_p5_poo_extra_4;

import java.util.Scanner;

/**
 *
 * @author Lichi y Fran
 */
public class Cuenta {
    String titular;
    double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public void retirarDinero() {
        Scanner leer = new Scanner(System.in);
        String rta;
        System.out.println("Hola " + titular);
        System.out.println("Su saldo es: " + saldo);
        do {
            System.out.print("Ingrese monto a extraer: ");
            double num = leer.nextDouble();
            if (saldo >= num) {
                saldo -= num;
                System.out.println("Su nuevo saldo es: " + saldo);
            }else {
                System.out.println("No es posible retirar esa cantidad");
                System.out.println("Su saldo es: " + saldo);
            }
            System.out.print("Desea seguir extrayendo? (S/N): ");
            rta = leer.next();
        } while (rta.equalsIgnoreCase("S"));
    }
}
