/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.lista.pkg1;

import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class exercicio15 {
    
public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double num,raiz,elevado;
        System.out.println("Digite um número: ");
        num = leitor.nextDouble();
        elevado = Math.pow(num,2);
        raiz = Math.sqrt(num);
        System.out.println("O quadrado do número digitado: " + elevado);
        System.out.println("A raiz do número digitado: " + raiz);
    }
}

