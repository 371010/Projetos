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
public class ex8 {
    
        public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double n1,num2,num3,conta1,conta2,conta3,conta4;
        System.out.println("Digite um número:");
        n1 = leitor.nextDouble();
        System.out.println("Digite outro número:");
        num2 = leitor.nextDouble();
        System.out.println("Qual operação deseja realizar?\n"
                          + "1-Adição\n"
                + "2-Subtração\n"
                + "3-Multiplicação\n"
                + "4-Divisão" );
        num3 = leitor.nextDouble();
        if (num3 == 1){
            conta1 = n1 +num2;
            System.out.println("Reposta:");
            System.out.println(n1+" + "+num2+" = "+conta1 );
        }else if (num3 ==2){
            conta2 = n1 - num2;
            System.out.println("Reposta:");
            System.out.println(n1+" - "+num2+" = "+conta2);
        }else if(num3 ==3){
            conta3 = n1*num2;
            System.out.println("Reposta:");
            System.out.println(n1+" x "+num2+" = "+conta3);
        }else if (num3 ==4){
            conta4 = n1/num2;
            System.out.println("Reposta:");
            System.out.println(n1+" / "+num2+" = "+conta4);
        }
    }
}
