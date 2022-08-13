package Lista7;

import java.util.Scanner;

public class ex17 {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int[] qtd = new int[5];
	    String[] nome = new String[3];
	    
		int i;
		int qtdAux=0;
	 
	   
	   
	    
	    for(i=0;i<3;i++) {
	    	System.out.printf("Digite o nome do cliente %d:\n",i+1);
		    nome[i]=num.next();
	    	System.out.printf("Digite a quantidade de dvds do cliente %d locados em 2022:\n",i+1);
		    qtd[i] =num.nextInt();
		}
	    for(i=0;i<3;i++) {
	    	    if(qtd[i]>=10) {
	    	    qtdAux=qtd[i]/10;
	    		System.out.printf("\nCliente %s tem direito a %d locacao gratis\n ",nome[i],qtdAux);
	        }
	    }
	   
	    
	    num.close();
	}

}



