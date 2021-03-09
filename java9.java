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
public class ex9 {
    
       public static void main(String[] args) {
        double nota1,media1,nota2,media2,nota3,media3,result;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Sua primeira nota:");
        nota1 = leitor.nextDouble();
        System.out.println("Sua segunda nota:");
        nota2 = leitor.nextDouble();
        System.out.println("Sua terceira nota:");
        nota3 = leitor.nextDouble();
        media1 = nota1*0.20;
        media2 = nota2*0.30;
        media3 = nota3*0.50;
        result = media1+media2+media3;
        System.out.println("Sua média ponderada: "+result);
    }
}

