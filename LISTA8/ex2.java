package lista8;

import java.util.Scanner;

public class ex2 {
public static void main(String[] args) {
	Scanner num = new Scanner(System.in);
	int A[][]= new int [3][3];
	 int contP=0,contI=0;
	
	for(int i=0;i<3;i++) {
    	for(int j=0;j<3;j++) {
    		System.out.printf("Digite o numero da linha %d coluna %d:\n",i,j);
    		A[i][j] =num.nextInt();
    		
    	}
    	}
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.printf( " %d ",A[i][j]);
			if(A[i][j]%2==0) {
				contP++;
				
			}
			else {
				contI++;
				
			}
		}
		System.out.println("  ");
	}
	System.out.printf("Quantidade de pares %d\n",contP);
	System.out.printf("Quantidade de impares %d\n",contI);
}
}
