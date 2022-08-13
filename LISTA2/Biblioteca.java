package lista2;
import java.util.Scanner;
public class Biblioteca {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    
	    double valor,multa=2.50;
	    int dias;
	    
	    System.out.print("digite os dias de atraso:\n");
	    dias=num.nextInt();
	    
	    
	    valor=dias*multa;
	    
	    
	    System.out.printf("%.1f reais é o valor a ser pago \n",valor);
	    
	    

	  num.close();

	}

}
