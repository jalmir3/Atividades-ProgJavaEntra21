package OrientaçãoObjetoLista3;
import java.util.Scanner;
public class testeVelha {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
		Velha velha = new Velha();
		
		while(true) {
			velha.cont++;
			
			velha.tabuleiro();
			velha.resultado();
			
			if(!velha.geraResult().equals("")) {
				System.out.println(velha.geraResult());
				break;
			}
				
			lacoW: while(true) {
				if(velha.cont % 2 == 1) {
					System.out.print("Informe a posição onde quer jogar (O): ");
					if(velha.jogada(sc.next().charAt(0)) == true) {
						System.out.println();
						break lacoW;
					}else
						System.out.println("\n== Jogada inválida ==\n");
				}else {
					System.out.print("Informe a posição onde quer jogar (X): ");
					if(velha.jogada(sc.next().charAt(0)) == true) {
						System.out.println();
						break lacoW;
					}else
						System.out.println("\n== Jogada inválida ==\n");
				}
				
			}

		}
			
		System.out.println("\nFim de jogo!");
		
		sc.close();
		
		
	}

	}


