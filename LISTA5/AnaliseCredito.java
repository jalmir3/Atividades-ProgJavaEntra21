package Lista5;

import java.util.Scanner;

public class AnaliseCredito {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		int saldo;
		
	    
		System.out.print("Digite o saldo medio do cliente:");
		saldo =num.nextInt();
		
	    if(saldo>=0 && saldo<201) {
	    	System.out.printf("Nenhum crédito");
	    }
	    else if(saldo>200 && saldo<401) {
	    	double credito=saldo * 0.2;
	    	System.out.printf("Credito de 20%% disponivel:%.1f reais",credito);
	    }
	    else if(saldo>400 && saldo<601) {
	        double credito=saldo * 0.3;
	    	System.out.printf("Credito de 30%% disponivel:%.1f reais",credito);
	    }
	    else  {
	    	double credito= saldo * 0.4;
	    	System.out.printf("Credito de 40%% disponivel:%.1f reais",credito);
	    }
	    
	  num.close();

	}

}