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
package java_p6_pooservicio_ejercicio_1;

import SERVIVIOS.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author recepcal
 */
public class Java_P6_POOServicio_Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio nuevo = new CuentaBancariaServicio();
        nuevo.CrearCuenta();
        int op;
        do {
            System.out.println("");
            System.out.println("MENU:");
            System.out.println("1- INGRESAR DINERO");
            System.out.println("2- EXTRAER DINERO");
            System.out.println("3- EXTRACCIÓN RÁPIDA (20%)");
            System.out.println("4- CONSULTA DE SALDO");
            System.out.println("5- CONSULTA DE DATOS");
            System.out.println("6- SALIR");
            System.out.print("Elija una opción: ");
            op = leer.nextInt();
            System.out.println("");
            switch(op) {
                case 1: nuevo.Ingresar();
                break;
                case 2: nuevo.Retirar();
                break;
                case 3: nuevo.ExtraccionRapida();
                break;
                case 4: nuevo.ConsultarSaldo();
                break;
                case 5: nuevo.ConsultarDatos();
                break;
                case 6: System.out.println("ADIOS!!!");
                break;
                default: System.out.println("Opción incorrecta");
            }
        } while (op != 6);

    }
    
}
