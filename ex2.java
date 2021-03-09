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
public class ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       double numero = 0;
        System.out.println("Digite um número:");
        numero = leitor.nextDouble();
       if (numero % 2 == 0){
           System.out.println("Número é par");
       }else 
            System.out.println("Numero é impar");
    }
}


