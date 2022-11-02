package OrientaçãoObjetoLista4;

import java.util.Scanner;

public class testeConversorTempo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.print("Informe a quantidade de dias a converter:");
		x = sc.nextInt();
		ConversorTempo.converSegundos(x);
		
		ConversorTempo.converMinutos(x);
		
		ConversorTempo.converHoras(x);
		
		ConversorTempo.converSemana(x);
		
		ConversorTempo.converMes(x);
		
		ConversorTempo.converAno(x);
	}

}
