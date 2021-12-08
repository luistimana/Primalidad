/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primalidad;

import java.util.Scanner;

/**
 *
 * @author Luis Timana
 */
public class Primalidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int numero = leer.nextInt();
        
        if(esPrimo(numero)){
            System.out.println("======================");
            System.out.println("Es numero primo");
            System.out.println("======================");
        } else {
            System.out.println("======================");
            System.out.println("No es numero primo");
            System.out.println("======================");
        }
    }
    
    static boolean esPrimo(int numero){
        int contador = 0;
        
        int[] numeros = new int[numero];
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i+1;        
        }
        
        for(int i : numeros){
            
            if(i == 1 || i == numero){
                continue;
            }
            
            if(numero % i == 0){
                contador++;
            }
        }
        
        return contador == 0;
    }
    
}
