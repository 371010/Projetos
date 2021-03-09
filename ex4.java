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
public class ex4 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int resposta;
        System.out.println("Qual o pokemon escolhido como o inicial de ash?");
        System.out.println("1-pikachu");
        System.out.println("2-Bulbasaur");
        System.out.println("3-Squirtle");
        System.out.println("4-Charmander");
        resposta = leitor.nextInt();
        if (resposta==4){
            System.out.println("Reposta correta!!");
        }else 
            System.out.println("Resposta errada, tende de novo!!");
    }
}

