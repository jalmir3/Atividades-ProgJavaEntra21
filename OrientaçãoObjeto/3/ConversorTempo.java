package OrientaçãoObjetoLista4;

public class ConversorTempo {
	
	static public void converMinutos(int x) {
		int resultado=0;
		resultado = (x*24)*60;
			System.out.printf(" %d dias tem %d minutos \n",x,resultado);
			
	}
	
	static public void converHoras(int x) {
		int resultado;
		resultado = x * 24;
		System.out.printf(" %d dias tem %d horas \n",x,resultado);
	}
	
	static public void converSegundos(int x) {
		int resultado;
		resultado = ((x * 24)*60)*60;
		System.out.printf(" %d dias tem %d segundos \n",x,resultado);
	}
	
	static public void converSemana(int x) {
		if(x > 7) {
			float resultado;
			resultado = x/7;
			System.out.printf(" %d dias é equivalente a %.1f semanas \n",x,resultado);
		}else
			System.out.println("Valor inválido para calcular a conversão de semana\n");
	}
	
	static public void converMes(int x) {
		if(x > 30 ) {
			float resultado;
			resultado = x/30;
			System.out.printf(" %d dias é equivalente a %.1f meses \n",x,resultado);
		}else
			System.out.println("Valor inválido para calcular os meses\n");
	}
	
	static public void converAno(int x) {
		if(x > 365) {
			float resultado;
			resultado = x/365;
			System.out.printf(" %d dias é equivalente a %.1f anos \n",x,resultado);
		}else
			System.out.println("Valor inválido para calcular os anos\n");
	}
}
