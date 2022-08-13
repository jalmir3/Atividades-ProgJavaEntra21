package lista6;

import java.util.Scanner;

public class ValidacaoSenha {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    
	    int login,senha;
	    
	    
	    System.out.print("Login:\n");
	    login =num.nextInt();
	    System.out.printf("Senha:\n");
	    senha =num.nextInt();
	    
	     
	     while(login==senha) {
	    	 System.out.print("Senha invalida digite novamente!\n");
	    	 System.out.print("Login:\n");
	 	    login =num.nextInt();
	 	    System.out.printf("Senha:\n");
	 	    senha =num.nextInt();
	     }
	    
	  num.close();
	} 
	 
}