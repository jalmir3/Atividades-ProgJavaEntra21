package Lista5;

import java.util.Scanner;

public class TipoProduto {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int codigo;
	    
	    
	    
	    System.out.print("digite o codigo do produto:\n");
	    codigo =num.nextInt();
	    
	  
	    if(codigo==1) {
	    	System.out.print("Alimento não perecivel\n");
	    }
	    else if(codigo>1 && codigo<5) {
	    	System.out.printf("Alimento perecível");
	    }
	    else if(codigo>4 && codigo<7) {
	    	System.out.print("Vestuario\n");
	    }
	    else if(codigo==7) {
	    	System.out.print("Higiene Pessoal\n");
	    }
	    else if(codigo>7 && codigo<16) {
	    	System.out.print("Limpeza e utensilios domesticos\n");
	    }
	    else {
	    	System.out.print("Invalido\n");
	    }
	  num.close();

	}

}

