package Lista7;

import java.util.Scanner;

public class ex10 {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    float[] nota1 = new float[2];
	    float[] nota2 = new float[2];
	    float[] media = new float[2];
	    
		int i;
	    float soma=0;
	   
	   
	    
	    for(i=0;i<2;i++) {
	    	System.out.printf("Digite a nota 1 do aluno %d:\n",i+1);
		    nota1[i] =num.nextFloat();
		    System.out.printf("Digite a nota 2 do aluno %d:\n",i+1);
		    nota2[i] =num.nextFloat();
		    soma=nota1[i]+nota2[i];
		    media[i]=soma/2;
		    }
	    for(i=0;i<2;i++) {
	    	if(media[i]>=7) {
	    		System.out.printf("\nmedia= %.1f aluno %d aprovado \n",media[i],i+1);
	    	}
	    	else {
	    		System.out.printf("\nmedia= %.1f aluno %d reprovado \n",media[i],i+1);
	    	}
	    }
	    
	 
	    
	     

    
	num.close();
	}

}

