package lista6;

import java.util.Scanner;

public class MediaMascFemi {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int sexo,cont=0,contM=0;
	    float altura,maior=Float.MIN_VALUE,menor=Float.MAX_VALUE,media=0,soma=0,aux=0,aux2=0;
	    for(int i=0;i<5;i++) {
	    	System.out.print("Digite seu sexo[1=Feminino/ 0= Masculino]:\n");
		    sexo =num.nextInt();
		    System.out.print("Digite altura:\n");
		    altura =num.nextFloat();
		    soma=soma+aux2;
		    aux2=aux2+altura;
		if(altura>maior) {
	    	maior=altura;
	    }
		else if(altura<menor) {
	    	menor=altura;
	    }
	    
	    if(sexo==1) {
	    	cont++;
	    	soma=soma+aux;
		    aux=aux+altura;
	    }
	    else if(sexo==0) {
	    	contM++;
	    }
	    }
	    float mediaT=aux2/5;
	    media=aux/cont;
	    int perc=(contM*100)/5;
	    System.out.printf("A maior altura é %.2f e a menor é %.2f\n",maior,menor);
	    System.out.printf("A media da altura feminina é %.2f metros \n ",media);
	    System.out.printf("A media da altura total é %.2f metros \n ",mediaT);
	    System.out.printf("O percentual de homens é %d %% \n ",perc);
	    
	    	
	    
		  
	      
	  num.close();
	  
	    } 
	 
	}

