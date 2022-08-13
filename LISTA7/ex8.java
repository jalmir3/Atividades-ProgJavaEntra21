package Lista7;

import java.util.Scanner;

public class ex8 {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int[] a = new int[10];
	    
	    
		int i,soma=0,cont=0,somaMaior=0,media=0,contMenor=0;
	    
	   
	    
	    for(i=0;i<10;i++) {
	    	System.out.printf("Digite o vetor na posição %d:\n",i);
		    a[i] =num.nextInt();
		    
		  }
	    for(i=0;i<a.length;i++) {
	    	if(a[i]<15) {
	    		soma=soma+a[i];
		   }
	    	else if(a[i]==15) {
	    		cont++;
	    	}
	    	else {
	    		contMenor++;
	    		somaMaior=somaMaior+a[i];
	    	}
	    }
	    
	    media=somaMaior/contMenor;
	    System.out.printf("\nSoma menores que 15= %d\n",soma);
	    System.out.printf("\nQuantidade que são igual a 15= %d \n",cont);
	    System.out.printf("\nMedia dos que são maior que 15= %d \n",media);
	    
	     

    
	num.close();
	}

}
