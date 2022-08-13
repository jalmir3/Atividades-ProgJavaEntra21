package lista2;

import java.util.Scanner;

public class VelocidadeMedia {


	public static void main(String[] args) {
		 Scanner num= new Scanner(System.in);
		    
		    String nome;
		    double distancia,tempo,total;
		    
		    
		    System.out.print("Digite seu nome:\n");
		    nome=num.next();
		    System.out.print("Digite a distancia:\n");
		    distancia=num.nextInt();
		    System.out.print("Digite o tempo em horas:\n");
		    tempo=num.nextInt();
		    
		    
		    total=distancia/tempo;
		    
		    
		    System.out.printf("a velocidade media do %s eh %.0f km/h\n",nome,total);
		    
		    

		  num.close();
	}

}
