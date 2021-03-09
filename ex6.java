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
public class ex6 {
    
public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double num,num2,conta;
        System.out.println("Digite um número:");
        num = leitor.nextDouble();
        System.out.println("Digite outro número:");
        num2 = leitor.nextDouble();
        conta = num/num2;
        System.out.println("Resultado da divisão do primeiro número pelo segundo: "+ conta);
    }
}

