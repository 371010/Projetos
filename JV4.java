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
public class exercicio4 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A,B,result,result2;
        System.out.println("Primeiro número: ");
        A = leitor.nextDouble();
        System.out.println("Segundo número; ");
        B = leitor.nextDouble();
        double p = 0;
        result = Math.pow(p,3);
        double s = 0;
        result2 = Math.pow(s, 3);
        System.out.println("Primeiro número elevado ao cubo: " + result);
        System.out.println("Segundo número elevado ao cubo: " + result2);
    }
}

