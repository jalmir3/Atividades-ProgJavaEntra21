package Lista5;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		float nota1,nota2,nota3,mediaEx,media;
		String nome;
	    
		System.out.print("Digite o nome do aluno:");
		nome =num.nextLine();
		System.out.print("Digite a primeira nota do aluno:");
		nota1 =num.nextFloat();
		System.out.print("Digite a segunda nota do aluno:");
		nota2 =num.nextFloat();
		System.out.print("Digite a terceira nota do aluno:");
		nota3 =num.nextFloat();
		System.out.print("Digite a media dos exercicios:");
		mediaEx =num.nextFloat();
	    
		media=(((nota1+nota2)*2)+((nota3*3)+mediaEx))/7;
	  
	    if(media>=9) {
	    	System.out.printf("Média de aproveitamento= %.1f Aluno %s conceito A",media,nome);
	    }
	    else if(media>=7.5 && media< 9) {
	    	System.out.printf("Média de aproveitamento= %.1f Aluno %s conceito B",media,nome);
	    }
	    else if(media>=6 && media< 7.5) {
	    	System.out.printf("Média de aproveitamento= %.1f Aluno %s conceito C",media,nome);
	    }
	    else if(media< 6) {
	    	System.out.printf("Média de aproveitamento= %.1f Aluno %s conceito D",media,nome);
	    }
	    
	  num.close();

	}

}
