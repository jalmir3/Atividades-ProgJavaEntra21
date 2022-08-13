package lista8;


import java.util.Random;
import java.util.Scanner;
public class ex1 {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		
	    Random numAleatorio=new Random();
	    int matrizAle [][] = new int[4][4];
		int i,j,maior=0,I=0,J=0;
	    for(i=0;i<4;i++) {
	    	for(j=0;j<4;j++) {
	    		matrizAle[i][j]=numAleatorio.nextInt(10);
	    		System.out.printf("%d",matrizAle[i][j]);
	    		if(matrizAle[i][j]>=maior) {
	    			maior=matrizAle[i][j];
	    			I=i;
	    			J=j;
	    	
	    		}
	    		
	    	}
	    	System.out.println("");
	    }
	
	    System.out.printf(" Maior numero é %d na linha %d e coluna %d\n",maior,I,J);
	   
	    
	    num.close();
	}

}
