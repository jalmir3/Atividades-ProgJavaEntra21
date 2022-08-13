package lista6;

import java.util.Scanner;

public class DadosPessoa {
 
	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	   
	    String nome;
	    char sexo,estadoCivil;
	    float sal;
	    int idade;
	    
	    System.out.print("Digite seu nome:\n");
	    nome =num.nextLine();
	    System.out.print("Digite seu sexo[M/F]:\n");
	    sexo =num.next().charAt(0);
	    while(sexo != 'F' && sexo != 'f' && sexo !='M' && sexo !='m') {
	    	System.out.print("Digite seu sexo[M/F]:\n");
		    sexo =num.next().charAt(0);
	    }
	    System.out.print("Digite seu Estado Civil[C/S/V/D]:\n");
	    estadoCivil =num.next().charAt(0);
	    while(estadoCivil !='C' && estadoCivil !='S' && estadoCivil !='D' && estadoCivil !='V' ) {
	    	System.out.print("Digite seu Estado Civil[C/S/V/D]:\n");
	 	    estadoCivil =num.next().charAt(0);
	    }
	    System.out.print("Digite sua idade:\n");
	    idade =num.nextInt();
	    while(idade<0 || idade>100) {
	    	System.out.print("Digite sua idade:\n");
		    idade =num.nextInt();
	    }
	    System.out.print("Digite seu salario:\n");
	    sal =num.nextFloat();
	    while(sal<0) {
	    	System.out.print("Digite seu salario:\n");
		    sal =num.nextFloat();
	    }
	    

	    System.out.printf("Seu nome:%s\n",nome);
	    System.out.printf("Seu sexo:%s\n",sexo);
	    System.out.printf("Seu estado civil:%s\n",estadoCivil);
	    System.out.printf("Sua idade:%d\n",idade);
	    System.out.printf("Seu salario:%.2f\n",sal);
	    
	  num.close();
	} 

	
	 
}