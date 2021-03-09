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
public class exercicio5 {
    
public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double lado,area, perimetro;
        System.out.println("Digite o tamanho de um dos lados do quadrado: ");
            lado = leitor.nextDouble();
        area = lado*lado;
        perimetro = lado*4;
        System.out.println("Área do quadrado: "+area);
        System.out.println("Perimetro do quadrado: "+perimetro);
    }
}

