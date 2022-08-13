package Lista5;

import java.util.Scanner;

public class TrocoQuantiaNotas {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		int valorCompra,valorPag,troco,nota100=0,nota10=0,nota1=0;
		
	    
	    
	    System.out.print("Digite o valor da compra:\n");
	    valorCompra =num.nextInt();
	    System.out.print("Digite o valor do pagamento:\n");
	    valorPag =num.nextInt();
	    if(valorPag<valorCompra) {
	    	System.out.print("Valor negado\n ");
	    }
	    
	    troco= valorPag-valorCompra;
	    
	    if(troco>0) {
	    
	    System.out.printf("troco=%d",troco);
	    nota100=troco/100;
	    
	    troco=troco%100;
	    
	    nota10=troco/10;
	    
	    troco=troco%10;
	    
	    nota1=troco/1;
	    
	    System.out.printf("\nnotas100=%d notas\nnotas10=%d notas\nnotas1=%d notas\n ",nota100,nota10,nota1);
	    
	    }
	    
	  num.close();

	}

}
