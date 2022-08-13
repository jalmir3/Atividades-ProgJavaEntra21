package lista2;

import java.util.Scanner;

public class Flores {

	public static void main(String[] args) {
Scanner num= new Scanner(System.in);
	    
	    
	    double totRosa,totTulipa;
	    int rosa,tulipa;
	    
	    System.out.print("Digite a qtd rosas:\n");
	    rosa=num.nextInt();
	    System.out.print("Digite a qtd de tulipas:\n");
	    tulipa=num.nextInt();
	    
	    totRosa =rosa * 2.80;
	    totTulipa= tulipa * 4.20;
	    
	    System.out.printf("Irá gastar com rosas %.1f reais / Irá gastar com tulipas %.1f reais\n",totRosa,totTulipa);
	    
	    

	  num.close();

	}

}
