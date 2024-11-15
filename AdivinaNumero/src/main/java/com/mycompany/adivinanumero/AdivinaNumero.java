/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adivinanumero;

/**
 *
 * @author 2024-2025 DAM1
 */

public class AdivinaNumero {

    public class Ahoracado {
    private String[] palabras = new String[]("nariz", "casa", "bicilcleta", "naranja");
    private String palabaSecreta;
    
    public Ahorcado() {
        escogePalabra();
        imprimePalabra();
    }
    /**
     * selecciona una palabra de las que tenemos en nuestro diccionario
     */
    private void escogePalabra(){
        palabraSecreta=palabras[(new Random().)nextInt(bound: palabras.length)];
    }
    /**
     * Imprime la palabra secreta 
     */
    
    private void imprimePalabra(){
        System.out.println(x:palabraSecreta);
    }
    
    
}
}