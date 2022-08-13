package lista6;

import java.util.Scanner;

public class MediaCDS {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    
	    int qtd;
	    float media=0,valor,soma=0;
	    
	    System.out.print("Quantidade de cds voce tem:\n");
	    qtd =num.nextInt();
	    
	    for(int i=0;i<qtd;i++) {
	    	System.out.printf("Digite o valor pago no cd %d:\n",i+1);
		    valor =num.nextInt();
		    
		    soma+=valor;
		 }
	     media=soma/qtd;
	     System.out.printf("Media gasta em cds %.2f reais\n",media);
	    
	  num.close();
	} 
	 
}