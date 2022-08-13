package Lista5;

import java.util.Scanner;

public class Natacao {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int codigo;
	    
	    
	    
	    System.out.print("digite a idade do nadador:\n");
	    codigo =num.nextInt();
	    
	  
	    if(codigo>4 && codigo<8) {
	    	System.out.print("Infantil A");
	    }
	    else if(codigo>7 && codigo<11) {
	    	System.out.printf("Infantil B");
	    }
	    else if(codigo>10 && codigo<14) {
	    	System.out.print("Juvenil A");
	    }
	    else if(codigo>13 && codigo<18) {
	    	System.out.print("Juvenil B");
	    }
	    else if(codigo>18) {
	    	System.out.print("Adulto");
	    }
	    else {
	    	System.out.print("Invalido\n");
	    }
	  num.close();

	}

}