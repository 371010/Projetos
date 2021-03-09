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
public class exercicio2 {
        public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String Nome,Estado,end,tel;
        System.out.println("Qual seu nome?");
        Nome = leitor.nextLine();
        System.out.println("Qual seu Esdado Civil?");
        Estado = leitor.nextLine();
        System.out.println("Qual seu endereço?");
        end = leitor.nextLine();
        System.out.println("Qual seu telefone?");
        tel = leitor.nextLine();
        System.out.println("Ficha do cliente: \n" + "Nome: " + Nome + "\n" + "Estado Civil: " + Estado + "\n" + "Endereço: " + end + "\n" + "Telefone: " + tel + "\n");
    }
}

