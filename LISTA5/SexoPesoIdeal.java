package Lista5;

import java.util.Scanner;

public class SexoPesoIdeal {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    double altura,ideal;
	    char sexo;
	    
	    
	    System.out.print("digite sua altura:\n");
	    altura =num.nextDouble();
	    System.out.print("digite seu sexo[M/F]:\n");
	    sexo = num.next().charAt(0);
	  
	    if(sexo=='f' || sexo=='F') {
	    	ideal=(72.7*altura)-58;
	    	System.out.printf("Seu peso ideal é:%.2f\n",ideal);
	    }
	    else if(sexo=='m' || sexo=='M') {
	    	ideal=(62.1*altura)-44.7;
	    	System.out.printf("Seu peso ideal é:%.2f\n",ideal);
	    }
	    else {
	    	System.out.print("sexo inválido:\n");
	    }

	  num.close();

	}

}
