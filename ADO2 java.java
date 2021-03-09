
package ado2.ex.pkg1;


import java.util.Scanner;


public class ADO2Ex1 {

   
    public static void main(String[] args) {
     int x, z, result = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor de X:");
        x = leitor.nextInt();
        System.out.println("Valor de Z:");
        z = leitor.nextInt();
        int conta = x;
        for (int i = 1; i != z; i++) {
            result = conta * z;
            conta = result;
        }
        System.out.println("Resulado do x elevado ao de Z:" + conta);
    }
}

    
    
    
