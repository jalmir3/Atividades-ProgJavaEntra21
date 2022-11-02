package Lista7TratamentoDeExcessoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		try{
		System.out.println("Eu sei dividir");
		System.out.println("Informe o primeiro valor");
		int x=sc.nextInt();
		System.out.println("Informe o segundo valor");
		int y=sc.nextInt();
		double r=(x/y);
		System.out.println("Resultado da divisão é:"+ r);
		}
	    catch(InputMismatchException e)
		  {
	    	System.out.println("Você deve entrar com valor numerico. Tente novamente");
			sc.nextLine();
			System.out.println("Informe o primeiro valor");
			int x=sc.nextInt();
			System.out.println("Informe o segundo valor");
			int y=sc.nextInt();
			double r=(x/y);
			System.out.println("Resultado da divisão é:"+ r);
	        }
		catch(ArithmeticException e)
		  {
	    	System.out.println("Não é possivel realizar divisão por 0. Tente novamente");
			sc.nextLine();
			System.out.println("Informe o primeiro valor");
			int x=sc.nextInt();
			System.out.println("Informe o segundo valor");
			int y=sc.nextInt();
			double r=(x/y);
			System.out.println("Resultado da divisão é:"+ r);
	        }
		
		  }
	
}
