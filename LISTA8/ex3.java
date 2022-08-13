package lista8;
import java.util.Random;
import java.util.Scanner;

public class ex3 {
public static void main(String[] args) {
	Scanner num = new Scanner(System.in);
	int M[][]= new int [10][10];
	Random numAleatorio=new Random();
	
	int maior5=0,menor5=100,maior7=0,menor7=100;
	
	for(int i=0;i<10;i++) {
    	for(int j=0;j<10;j++) {
    		M[i][j]=numAleatorio.nextInt(10);
    		System.out.printf(" %d ",M[i][j]);
    		if(i==5 && M[i][j]>maior5) {
    			maior5=M[i][j];
    			}
    			else if(i==5 && M[i][j]<menor5) {
    				menor5=M[i][j];
    			}
    		if(j==7 && M[i][j]>maior7) {
    			
    				maior7=M[i][j];
    			}
    			else if(j==7 && M[i][j]<menor7) {
    				menor7=M[i][j];
    			}
    		
        }
    	System.out.println("");
    	}
	
	System.out.printf("Maior %d e menor %d da linha 5\n",maior5,menor5);
	System.out.printf("Maior %d e menor %d da coluna 7\n",maior7,menor7);
}
}

