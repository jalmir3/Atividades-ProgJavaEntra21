package lista8;

import java.util.Scanner;

public class JogoVelha {
public static void main(String[] args) {
	Scanner num = new Scanner(System.in);
	String velha[][]= new String [3][3];
	String tabuleiro []= new String[8];
	String j1,j2;
	int linha=0,coluna=0,teste=0,cont=0;
	
	 System.out.print("Jogador 1 digite seu nome:\n");
	 j1=num.nextLine();
	 System.out.print("Jogador 2 digite seu nome:\n");
	 j2=num.nextLine();
	 
	 
	for(int i=0;i<3;i++) {
    	for(int j=0;j<3;j++) {
    		velha[i][j] = "_";
    	}
    	}
	while(true) { 
        do {
             System.out.printf("Jogador %s,Informe a linha: ",j1);
             linha = num.nextInt();

             while(linha < 0 || linha > 2) {
         System.out.println("Jogada invalida!.");
                 System.out.printf("Jogador %s,Informe a linha: ",j1);
                 linha = num.nextInt();
             }

             System.out.printf("Jogador %s,Informe a coluna: ",j1);
             coluna = num.nextInt();

             while(coluna < 0 || coluna > 2) {
                 System.out.println("Jogada invalida!.");
                 System.out.printf("Jogador %s,Informe a coluna: ",j1);
                 coluna = num.nextInt();
             }

             if(velha[linha][coluna].equals("_")) {
                 velha[linha][coluna] = "X";
                 teste = 1;
             } else {
                 teste = 0;
                 System.out.println("Jogada inválida");
             }

        } while(teste == 0);
		cont++;
		teste=0;
		System.out.println();
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(velha[i][j]+ "\t");
            }
            System.out.println("\n");
        }
        System.out.println();
        do {
            System.out.printf("Jogador %s,Informe a linha: ",j2);
            linha = num.nextInt();

            while(linha < 0 || linha > 2) {
        System.out.println("Jogada invalida!.");
                System.out.printf("Jogador %s,Informe a linha: ",j2);
                linha = num.nextInt();
            }

            System.out.printf("Jogador %s,Informe a coluna: ",j2);
            coluna = num.nextInt();

            while(coluna < 0 || coluna > 2) {
                System.out.println("Jogada invalida!.");
                System.out.printf("Jogador %s,Informe a coluna: ",j2);
                coluna = num.nextInt();
            }

            if(velha[linha][coluna].equals("_")) {
                velha[linha][coluna] = "O";
                teste = 1;
            } else {
                teste = 0;
                System.out.println("Jogada inválida");
            }

       } while(teste == 0);
        cont++;
		teste=0;
		System.out.println();
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(velha[i][j]+ "\t");
            }
            System.out.println("\n");
        }
       
        } 
}
}

