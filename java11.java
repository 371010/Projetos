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
public class ex11 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double base, altura, preço, area, valor;
        System.out.println("Tamanho base do terreno:");
        base = leitor.nextDouble();
        System.out.println("Tamanho altura do terreno:");
        altura = leitor.nextDouble();
        System.out.println("Preço por metro quadrado: ");
        preço = leitor.nextDouble();
        area = (base*altura);
        area = Math.pow(area, 2);
        valor = preço*area;
        System.out.println("Area do terreno: "+area+"\n"+"Valor do terreno: "+valor);
        
        
}
}

