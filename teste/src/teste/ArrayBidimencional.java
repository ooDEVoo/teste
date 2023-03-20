package teste;

import java.security.SecureRandom;  //implementa��o de n�meros aleat�rios

public class ArrayBidimencional {

		public static void main(String[] args) {
			
			final int linha = 3;  // final= constante
			final int coluna = 5;
			int[][] numeros = new int[linha][coluna];
			
			// Preenche o array com n�meros aleat�rios
			for(int l = 0; l < linha; l ++) {
				for(int c = 0; c < coluna; c++) {
					numeros[l][c] = new SecureRandom().nextInt(100); //preenche os arrays com n�meros rand�micos de 0 � 100
			}
			}
			for(int l = 0; l < linha; l ++) {
				for(int c = 0; c < coluna; c++) {
					System.out.print("-" + numeros[l][c]); 
				}
				System.out.println("\n");
			}
		}
}