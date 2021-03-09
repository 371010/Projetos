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
public class ex10 {
    
public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int horas,minutos,segundos,controle,entrada;
        System.out.println("digite o tempo de duração em segundos: ");
        entrada = leitor.nextInt();
        controle = entrada;
        horas = controle/3600;
        controle = controle%3600;
        minutos = controle/60;
        controle = controle%60;
        segundos = controle;
        System.out.println("Horas: " + horas + "\n" +
                "Minutos: " + minutos + "\n" + "Segundos: " + segundos);
    }
}

