package lista2;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
	    
	    String nome;
	    int horasTrabalhadas,qtdFilhos;
	    double valorHora,mes,total;
	    
	    System.out.print("Digite o seu nome:\n");
	    nome=num.nextLine();
	    System.out.print("Digite a quantidade de horas trabalhadas:\n");
	    horasTrabalhadas=num.nextInt();
	    System.out.print("Digite o valor da hora:\n");
	    valorHora=num.nextInt();
	    System.out.print("Digite a quantidade de filhos:\n");
	    qtdFilhos=num.nextInt();
	    
	    mes =(horasTrabalhadas * valorHora) * (qtdFilhos*3)/100 ;
	    total=(horasTrabalhadas * valorHora) + mes;
	    
	    System.out.printf("O valor que %s vai receber é %.1f reais\n",nome,total);
	    
	    

	  num.close();
	}

}
