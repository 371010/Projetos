
package pi.lista.pkg1;

import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class exercicio1 {
     public static void main(String[] args) {
        float nt1,nt2,media;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Sua primeira nota: ");
        nt1 = leitor.nextFloat();
        System.out.println("Sua segunda nota: ");
        nt2 = leitor.nextFloat();
        media = (nt1 + nt2)/2;
        if (media<6){
            System.out.println("Voce foi reprovado!!!");
        } else if (media>6){
        System.out.println("Parabens, vc foi aprovado");
    }
            
        System.out.println("A sua média é igual a: " + media);
        
    }
}

