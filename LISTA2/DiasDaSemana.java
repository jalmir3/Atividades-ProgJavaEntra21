package lista2;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
    Scanner num= new Scanner(System.in);
	    
	    int dia;
	   
	    
	    System.out.print("Digite um numero referente ao dia da semana(1 a 7):\n");
	    dia=num.nextInt();
	    
	    
	    switch(dia) {
	    case 1:
	    	System.out.println("Segunda-feira");
	    	break;
	    case 2:
	    	System.out.println("Terça-feira");
	    	break;
	    case 3:
	    	System.out.println("Quarta-feira");
	    	break;
	    case 4:
	    	System.out.println("Quinta-feira");
	    	break;
	    case 5:
	    	System.out.println("Sexta-feira");
	    	break;
	    case 6:
	    	System.out.println("Sábado");
	    	break;
	    case 7:
	    	System.out.println("Domingo");
	    	break;
	    }
	    
	    

	  num.close();
	}

}
