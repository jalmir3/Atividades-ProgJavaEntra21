package Lista5;

import java.util.Scanner;

public class VogaisConsoantes {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		char letra;
		
	   
		System.out.print("Digite uma letra minuscula\n");
		letra =num.next().charAt(0);
		
		
		switch(letra) {
		case 'a','e','i','o','u':
			System.out.printf("A letra %s eh vogal",letra);
			break;
		case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','x','y','z':
			System.out.printf("A letra %s eh consoante",letra);
		    break;
		}
		
		 
		
	    
	   
	  num.close();

	}
}

