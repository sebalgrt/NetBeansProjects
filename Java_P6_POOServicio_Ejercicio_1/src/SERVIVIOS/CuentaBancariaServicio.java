/*
 Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
 */
package SERVIVIOS;

import ENTIDADES.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author recepcal
 */
public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in);
    CuentaBancaria nueva = new CuentaBancaria();
    
    public void CrearCuenta() {
        System.out.print("Ingrese número de cuenta: ");
        nueva.setNumeroCuenta(leer.nextInt());
        System.out.print("Ingrese número de DNI: ");
        nueva.setDniCliente(leer.nextInt());
        nueva.setSaldoActual(0);
    }
    
    public void Ingresar() {
        System.out.print("Ingrese monto a depositar: ");
        double ing = leer.nextDouble();
        nueva.setSaldoActual(nueva.getSaldoActual() + ing);
    }
    
    public void Retirar() {
        System.out.print("Ingrese monto a extraer: ");
        double ext = leer.nextDouble();
        if (ext > nueva.getSaldoActual()) {
            System.out.println("Monto no disponible");
            System.out.println("Se retiran " + nueva.getSaldoActual());
            nueva.setSaldoActual(0);
        }else {
            nueva.setSaldoActual(nueva.getSaldoActual() - ext);
        }
    }
    
    public void ExtraccionRapida() {
        double extRap = nueva.getSaldoActual() * 0.20;
        System.out.println("Se retiran " + extRap);
        nueva.setSaldoActual(nueva.getSaldoActual() - extRap);
    }
    
    public void ConsultarSaldo() {
        System.out.println("El saldo de la cuenta es: " + nueva.getSaldoActual());
    }
    
    public void ConsultarDatos() {
        System.out.println("Nº de cuenta: " + nueva.getNumeroCuenta());
        System.out.println("DNI cliente: " + nueva.getDniCliente());
        System.out.println("Saldo actual: " + nueva.getSaldoActual());
    }
}
