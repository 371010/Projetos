/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista7;

import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class Lista7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner leitor = new Scanner(System.in);
        double numero;
        System.out.println("Digite um número:");
        numero = leitor.nextDouble();
        
        if(numero==0)
        {
            System.out.println("Número igual a 0!");
        }else if (numero > 0){
            System.out.println("Número é positivo!");
    }else if (numero < 0)
            System.out.println("Número é negativo");
    }
}

    
   
