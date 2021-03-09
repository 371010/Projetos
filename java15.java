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
public class ex15 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double preço,p;
        String modelo,marca;
        System.out.println("Digite o modelo do celular: ");
        modelo = leitor.next();
        System.out.println("Digite a marca do celular: ");
        marca = leitor.next();
        System.out.println("Digite o preço do celular: ");
        preço = leitor.nextDouble();
        p = preço*(1.42);
        System.out.println("Modelo do celular: "+ modelo);
        System.out.println("marca do celular: "+ marca);
        System.out.println("Preço do celular para o consumidor: "+ p);
    }
}

