
package ex4;



import java.util.Scanner;

public class VetorJava {
	
	private int[][] matriz;
	
	
	public VetorJava(int[][] matriz) {
		this.matriz = matriz;
	}

	public void le_vetor(int[][] matriz) {
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				matriz[i][j] = in.nextInt();
			}
		}
		in.close();
	}
	
	public void exibe_matriz(int[][] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				System.out.println(matriz[i][j]);
			}
		}
	}
	
	public float media_aritmetica(int[][] matriz) {
		int soma = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				soma += matriz[i][j];
			}
		}
		return soma/(matriz.length * 2);
	}
	
	public void printa_abaixo_media(int[][] matriz) {
		float media = media_aritmetica(matriz);
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				if(matriz[i][j] <= media) System.out.println(matriz[i][j]);
			}
		}
	}
}


