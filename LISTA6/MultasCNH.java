package lista6;

import java.util.Scanner;

public class MultasCNH {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int carteira,numMultas,valorMult,n1,maior=0,soma=0,aux2=0;
	    
	    
	    do {
	    int aux=0;
	    System.out.print("Digite o numero da carteira de motorista:\n");
	    carteira =num.nextInt();
	    System.out.print("Digite o numero de multas:\n");
	    numMultas =num.nextInt();
	    for(int i=0;i<numMultas;i++) {
	    	
	    
	    	System.out.print("Digite o valor das multa:\n");
		    valorMult =num.nextInt();
		    soma=soma+aux;
		    aux=aux+valorMult;
		}
	    aux2=aux2+aux;
	    if(numMultas>maior) {
	    	maior=carteira;
	    }
	    System.out.printf("Soma das multas do motorista %d é %d\n",carteira,aux);
	    System.out.print("Digite 1 para cadastrar e 0 para sair:\n");
		n1 =num.nextInt();
	    }while(n1==1);
	    System.out.printf("Carteira com maior numero de multas:%d\n",maior);
	    System.out.printf("Soma das multas é %d reais\n",aux2);
	    
	    	
	    
		  
	      
	  num.close();
	  
	    } 
	 
	}

