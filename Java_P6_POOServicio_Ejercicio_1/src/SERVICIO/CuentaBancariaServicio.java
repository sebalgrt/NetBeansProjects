/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVICIO;

import ENTIDADES.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in);
    CuentaBancaria nueva = new CuentaBancaria();

public void CrearCuenta() {
    System.out.print("Ingrese número de cuenta: ");
    nueva.setNumeroCuenta(leer.nextInt());
    System.out.print("Ingrese DNI del cliente: ");
    nueva.setDniCliente(leer.nextInt());
    nueva.setSaldoActual(1000);
}

public void Retirar() {
    double saldo = nueva.getSaldoActual();
    System.out.print("Ingrese monto a extraer: ");
    double monto = leer.nextDouble();
    saldo =- monto;
    nueva.setSaldoActual(saldo);
    System.out.println("Su nuevo saldo es:" + nueva.getSaldoActual());
    
    
}
    
    
}
