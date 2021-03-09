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
public class ex3 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int um,dois,tres;
        System.out.println("Menu Principal"+"\n"+"1-fim"+"\n"+"2-Cadastro"+"\n"+"3-Consulta");
        um = leitor.nextInt();
        
        if(um == 1){
            System.out.println("Atividade finalizada!");
        }else if (um ==2){
            System.out.println("iniciar o cadastro!");
        }else if(um ==3){
            System.out.println("Iniciar Consulta");
        }
        
    }
}

