package OrientaçãoObjetoLista4;

import java.util.Scanner;

public class testeCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("Informe um numero inteiro:");
		a = sc.nextInt();
		System.out.print("Informe outro número inteiro:");
		b = sc.nextInt();
		
		System.out.print("Soma=");
		System.out.println(Calculadora.soma(a, b));
		
		System.out.print("Subtracao=");
		System.out.println(Calculadora.subtracao(a, b));
		
		System.out.print("Multiplicacao=");
		System.out.println(Calculadora.multiplicacao(a, b));
		
		System.out.print("Divisao=");
		System.out.println(Calculadora.divisao(a, b));
		
		System.out.print("Potencia=");
		System.out.println(Calculadora.potencia(a, b));
		
	}

}
