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
public class ex9 {
    
public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double produto, conta,conta2;
        System.out.println("Qual o valor do produto?");
        produto = leitor.nextDouble();
        if(produto <20){
        conta = produto*1.45;
            System.out.println("Valor da venda: "+conta);
    }else if(produto>=20){
        conta2 = produto*1.30;
            System.out.println("Valor da venda: "+conta2);
    }
    }
}

