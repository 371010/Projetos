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
public class ex5 {
    
public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int ano,conta;
        System.out.println("Digite o ano:");
        ano = leitor.nextInt();
        conta = ano%4;
        if (conta==0){
        System.out.println("O ano é bissexto!!");
    }else
        System.out.println("O ano não é bissexto!");
    }
}

