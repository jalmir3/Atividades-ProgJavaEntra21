package lista2;
import java.util.Scanner;
public class LanHouse {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    
	    double tempo,valor;
	    
	    
	    System.out.printf("digite o tempo em minutos que ficou na lanhouse:\n");
	    tempo=num.nextInt();
	    
	    
	    valor=(tempo/60)*2.3;
	    
	    
	    System.out.printf("%.1f reais é o valor a ser pago \n",valor);
	    
	    

	  num.close();

	}

}
