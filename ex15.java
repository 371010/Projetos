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
public class ex15 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String num;
        System.out.println("Digite um dia da semana:");
        num = leitor.nextLine();
        String nul = null;
        String domingo = nul;
        String segunda = null;
        String terça = null;
        String quarta = null;
        String quinta = null;
        String sexta = null;
        String sabado = null;
        if(num == null ? domingo == null : num.equals(domingo)){
            System.out.println("Dia 1");
    }else if(num == null ? segunda == null : num.equals(segunda)){
            System.out.println("Dia 2");
    }else if(num == null ? terça == null : num.equals(terça)){
            System.out.println("dia 4");
    }else if(num ==quarta){
            System.out.println("Dia 5");
    }else if(num ==quinta){
            System.out.println("Dia 6");
    }else if(num ==sexta){
            System.out.println("Dia 7");
    }else if(num ==sabado){
            System.out.println("Dia 8");
    }else{
            System.out.println("Erro!");
}}}

