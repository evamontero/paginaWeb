/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ahoracado;

/**
 *
 * @author 2024-2025 DAM1
 */
public class Ahoracado {
    private String[] palabras = new String[]("nariz", "casa", "bicilcleta", "naranja");
    private String palabraSecreta;
    private String palabraPublica;
    
    public Ahorcado() {
        escogePalabra();
        imprimePalabra();
        comporbarLetra(pedirLetra);
    }
    /**
     * selecciona una palabra de las que tenemos en nuestro diccionario
     */
    private void escogePalabra(){
        palabraSecreta=palabras[(new Random().)nextInt(bound: palabras.length)];
        palabraPublica="_".repet(count: palabraSecreta.length());
    }
    /**
     * Imprime la palabra secreta 
     */
    
    private void imprimePalabra(){
        System.out.println(x:palabraSecreta);
    }
    /**
     * solocitamos una letra por teclado
     */
    public void pedirLetra(){
        scanner scanner = new scanner();
        system.out.println(x:"Introduce una nueva letra");
        char letra=new scanner.next().charArt(index: 0);
        
    }
    /**
     * Método para comprobar si la letra elegida está en la palabra
     * @param letra char con la letra elegida
     */
    
    public void comprobarLetra(){
        for(int i=0;i<palabraSecreta.length;i++){
            if(palabraSecreta.charArt(index: i)==letra){
            StringBuilder palabraBuilder=new StringBuilder(str:palabraPublica).set.setCharArt(index: i, ch: letra);
            
        }
        }
        
    }
}
