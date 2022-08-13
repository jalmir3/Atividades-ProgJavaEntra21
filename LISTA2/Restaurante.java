package lista2;
import java.util.Scanner;
public class Restaurante {

	public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
	    
	    double peso,prato=230,valor;
	    
	    
	    System.out.print("digite o peso em gramas:\n");
	    peso=num.nextInt();
	    
	    
	    valor=(peso-prato)*0.02;
	    
	    
	    System.out.printf("%.1f reais é o valor a ser pago \n",valor);
	    
	    

	  num.close();
	}

}
