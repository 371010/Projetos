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
public class exercicio6 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double fixo,salario,vendas,soma;
        System.out.println("Digite seu salario fixo:");
        fixo = leitor.nextDouble();
        System.out.println("Digite o total de vendas efetuadas no mes(em dinheiro)");
        vendas = leitor.nextDouble();
        soma = vendas*0.15;
        salario = fixo + soma;
        System.out.println("Salario no final do mês: "+salario);
    }
}

