package lista2;

import java.util.Scanner;

public class Fotos {

	public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
	    
	    int qtdFotos;
	    
	    System.out.print("Digite a qtd de fotos:\n");
	    qtdFotos=num.nextInt();
	    
	    if(qtdFotos<100) {
	    	double totalFotos=qtdFotos* 0.70;
	    	System.out.printf("Irá gastar com fotos %.1f reais",totalFotos);
	    }
	    else {
	    	int tot=qtdFotos-100;
	    	double total=(tot*0.7)+44;
	    	System.out.printf("Irá gastar com fotos %.1f reais",total);
	    	
	    }
	    
	   num.close();
	}

}
