/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraporpina;

/**
 *
 * @author 2024-2025 DAM1
 */

import java.util.Scanner;

public class CalculadoraPropina {
    public double cuenta; // Variable para guardar el precio de la cuenta
    public double porcentajePropina; // Variable para guardar el porcentaje de propina

    // Constructor
    public CalculadoraPropina(double cuenta, double porcentajePropina) {
        this.cuenta = cuenta;
        this.porcentajePropina = porcentajePropina;
    }

    // Método para calcular el total de la cuenta con propina
    public double calcularCuentaTotal() {
        return cuenta + (cuenta * porcentajePropina / 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el precio de la cuenta
        System.out.print("Introduzca el precio de la cuenta: ");
        double cuenta = scanner.nextDouble();

        // Solicitar al usuario el porcentaje de propina
        System.out.print("Introduzca el porcentaje de propina que quiere dejar: ");
        double porcentajePropina = scanner.nextDouble();

        // Crear una instancia de CalculadoraPropina
        CalculadoraPropina calculadora = new CalculadoraPropina(cuenta, porcentajePropina);

        // Imprimir el valor total de la cuenta
        System.out.println("El valor total de la cuenta es: " + calculadora.calcularCuentaTotal());

        scanner.close();
    }
}

