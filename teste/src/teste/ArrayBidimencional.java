package teste;

import java.security.SecureRandom;  //implementação de números aleatórios

public class ArrayBidimencional {

		public static void main(String[] args) {
			
			final int linha = 3;  // final= constante
			final int coluna = 5;
			int[][] numeros = new int[linha][coluna];
			
			// Preenche o array com números aleatórios
			for(int l = 0; l < linha; l ++) {
				for(int c = 0; c < coluna; c++) {
					numeros[l][c] = new SecureRandom().nextInt(100); //preenche os arrays com números randômicos de 0 à 100
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