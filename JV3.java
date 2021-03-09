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
public class exercicio3 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A,B,C,result;
        System.out.println("Primeiro número:");
        A = leitor.nextDouble();
        System.out.println("Segundo número:");
        B = leitor.nextDouble();
        System.out.println("Terceiro número:");
        C = leitor.nextDouble();
        result = A*B*C;
        System.out.println("Produto: " + result);
}
}

