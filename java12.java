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
public class ex12 {
    
public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double l,p,gasolina,total;
        System.out.println("Reais em gasolina: ");
        l = leitor.nextDouble();
        System.out.println("Preço por litro de gasolina:");
        p = leitor.nextDouble();
        gasolina = l/p;
        System.out.println("Litros disponiveis: "+gasolina);
    }
}

