package Lista7;

import java.util.Scanner;

public class um {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int[] vetor1 = new int[10];
	    int[] vetor2 = new int[vetor1.length];
	    
		int i,soma1=0,soma2=0,somatotal=0,maior=0,maior2=0,menor=Integer.MAX_VALUE,menor2=Integer.MAX_VALUE;
	    
	   
	    
	    for(i=0;i<vetor1.length;i++) {
	    	System.out.printf("Digite o vetor na posição %d:\n",i);
		    vetor1[i] =num.nextInt();
		    soma1=soma1+vetor1[i];
		    if(vetor1[i]>maior) {
		    	maior=vetor1[i];
		    }
		    if(vetor1[i]<menor) {
		    	menor=vetor1[i];
		    }
		    }
	    for(i=0;i<vetor1.length;i++) {
	    	System.out.printf("Digite o vetor na posição %d:\n",i);
		    vetor2[i] =num.nextInt();
		    soma2=soma2+vetor2[i];
		    if(vetor2[i]>maior) {
		    	maior2=vetor2[i];
		    }
		    if(vetor2[i]<menor2) {
		    	menor2=vetor2[i];
		    }
		    }
	    
	    if(maior>maior2) {
	    	System.out.printf("maior :%d posicao %d\n",maior,i);
	    }
	    else {
	    	System.out.printf("maior :%d posicao %d\n",maior2);
	    }
	    if(menor<menor2) {
	    	System.out.printf("menor :%d\n",menor);
	    }
	    else {
	    	System.out.printf("menor :%d\n",menor2);
	    }
	    
	    somatotal=soma1+soma2;
	    System.out.printf("Soma total :%d\n",somatotal); 
	    
	    
	    
	    
	num.close();
	} 

	
	 
}
