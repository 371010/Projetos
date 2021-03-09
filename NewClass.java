/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg8;

import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class NewClass {
    
  
import java.util.Scanner;


public class ex7 {
    
    static int soma(int a, int b){
        
       int conta = a+b; 
       return conta;
    }
    
    static int sub(int a, int b){
        
       int cont = a-b; 
       return cont;
    }
    
    static int multi(int a, int b){
        
        int multiplicacao = a*b;
        return multiplicacao;
    } 
    
    static double divi(double a, double b){
        
        double divisao = a/b;
        return divisao;
    } 
    
    
    
     Scanner leitor = new Scanner (System.in);    
         
     int a=0 , b=0;
         
         System.out.println("Digite um valor"); 
         int val1=leitor.nextInt();
         
         System.out.println("Digite outro valor"); 
         int val2=leitor.nextInt();
     
         System.out.println("Digite uma das opções a seguir:  \n 1-soma \n 2-sub \n 3-multi \n 4-div \n "); 
         int escolha = leitor.nextInt();
         
         if(escolha==1){
            
             int s = soma(val1,val2);
             System.out.println("Você escolheu soma e o resultado é: "+s);
             
             
         }else if(escolha==2){
           
             int subtracao = sub(val1,val2);
             System.out.println("Você escolheu subtracao e o resultado é: "+subtracao);
          
         }else if(escolha==3){
           
             int multiplicacao = multi(val1,val2);
             System.out.println("Você escolheu multiplicacao e o resultado é: "+multiplicacao);
          
         }else if(escolha==4){
           
             double divisao = divi(val1,val2);
             System.out.println("Você escolheu divisao e o resultado é: "+divisao);
          
         }
         
     ]
]
]