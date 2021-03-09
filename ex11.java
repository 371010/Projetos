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
public class ex11 {
    
public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade, classe;
        System.out.println("Digite sua idade:");
        idade = leitor.nextInt();
        if(idade >=5 && idade <=7){
            System.out.println("Categoria: Infantil A");
        }else if(idade >=8 && idade <=10){
        System.out.println("Categoria: Infantil B");
    }else if(idade >=11 && idade <=13){
            System.out.println("Categoria: Juvenil A");
    }else if(idade >=14 && idade <=17){
            System.out.println("Categoria: Juvenil B");
    }else if(idade >=18){
            System.out.println("Categoria: Sênior");
    }else 
            System.out.println("Idade incorreta!");        
}}

