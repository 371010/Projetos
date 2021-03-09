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
public class ex16 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double min, dedicados, conta,semanal, result;
        System.out.println("Digite quantos minutos vc joga por dia de Overwatch: ");
        min = leitor.nextDouble();
        System.out.println("Digite a quantidade de dias que vc jogou na semana:");
        semanal = leitor.nextDouble();
        conta = min*semanal;
        dedicados = conta*52;
        result = dedicados/60;
        System.out.println("Vc terá dedicado " + result + "Horas ao jogo Overwatch no ano");
    }
}

