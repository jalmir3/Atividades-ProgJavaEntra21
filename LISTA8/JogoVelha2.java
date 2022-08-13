package lista8;

import java.util.Scanner;

public class JogoVelha2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] tabuleiro = new int[3][3];
		int jogador = 1;
		int jogada = 0;
		
		int coluna;
		int linha;
		
		jogo:
		while(true) {
			for (int[] linhaTabuleiro : tabuleiro) {
				for (int posicao : linhaTabuleiro) {
					if (posicao == 0) {
						System.out.print("   |"); 
					}else if(posicao == 1){
						System.out.print(" X |");
					}else if(posicao == -1){
						System.out.print(" O |");
					}
				}
				System.out.println();
			}
			
			jogada++;
			
			if(jogada > 5) {
				for (int i = 0; i < tabuleiro.length; i++) {
					int somaLinha = 0;
					int somaColuna= 0;
					for (int j = 0; j < tabuleiro[i].length; j++) {
						somaLinha += tabuleiro[i][j];
						somaColuna += tabuleiro[j][i];
						
					}
					if (somaLinha == 3 || somaColuna == 3 ) {
						System.out.println("Jogador X ganhou");
						break jogo;
					}else if (somaLinha == -3 || somaColuna == -3) {
						System.out.println("Jogador O ganhou");
						break jogo;
					}
				}
				
				if (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro [2][2] == 3 || tabuleiro[2][0] + tabuleiro[1][1] + tabuleiro [0][2] == 3 ) {
					System.out.println("Jogador X ganhou");
					break jogo;
				}else if (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro [2][2] == -3 || tabuleiro[2][0] + tabuleiro[1][1] + tabuleiro [0][2] == -3 ) {
					System.out.println("Jogador O ganhou");
					break jogo;
				}
			}
			
			if (jogada == 10) {
				System.out.println("Velha");
				break jogo;
			}
			
			while(true) {
				System.out.println("Digite a linha da jogada: ");
				linha = input.nextInt();
				System.out.println("Digite a coluna da jogada: ");
				coluna = input.nextInt();
				
				if (tabuleiro[linha][coluna] == 0 && coluna < 3 && coluna >= 0 && linha < 3 && linha >= 0 ) {
					tabuleiro[linha][coluna] = jogador;
					jogador = -jogador;
					break;
				}else {
					System.out.println("Jogada inv�lida");
					continue;
				}
			}
		}
		
	}
}
