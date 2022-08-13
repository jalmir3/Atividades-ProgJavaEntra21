package lista2;

import java.util.Scanner;

public class CustoFesta {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    
	    
	    int qtdpessoas;
	    double total;
	    
	    System.out.print("Digite a quantidade de pessoas:\n");
	    qtdpessoas=num.nextInt();
	    
	    
	    total= qtdpessoas * 19.2;
	    
	    
	    System.out.printf("O valor que lucas vai gastar é %f reais\n",total);
	    
	    

	  num.close();
	}

}
