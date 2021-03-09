/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2F;

import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class ex8 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade, idade2,idade3;
        System.out.println("Qual sua idade em dias?");
        idade = leitor.nextInt();
        idade2 = idade/365;
        System.out.println("Sua idade em anos: "+idade2);
    }
}

