package Lista5;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    double peso,altura,imc;
	    
	    
	    
	    System.out.print("digite seu peso:\n");
	    peso =num.nextDouble();
	    System.out.print("digite sua altura:\n");
	    altura =num.nextDouble();
	    
	    imc=(float)peso/(altura*altura);
	    System.out.printf("IMC=%.1f\n",imc);
	    
	    if(imc<18.6) {
	    	System.out.print("Abaixo do peso\n");
	    }
	    else if(imc>18.5 && imc<25.1) {
	    	System.out.printf("Peso normal");
	    }
	    else if(imc>25 && imc<30.1) {
	    	System.out.print("Acima do peso\n");
	    }
	    else {
	    	System.out.print("Obeso\n");
	    }
	    
	  num.close();

	}

}
