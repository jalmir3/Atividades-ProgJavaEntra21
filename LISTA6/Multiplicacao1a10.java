package lista6;

import java.util.Scanner;

public class Multiplicacao1a10 {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int num1,mult=0;
		System.out.print("Digite um numero:\n");
	     num1=num.nextInt();
	     for(int i=1;i<11;i++) {
	    	 mult=num1*i;
	    	 System.out.printf("%d x %d=%d\n", num1,i,mult); 
	     }
	    
	  num.close();
	} 
	 
}