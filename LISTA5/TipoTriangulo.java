package Lista5;

import java.util.Scanner;

public class TipoTriangulo {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		int lado1,lado2,lado3;
		
	    
		System.out.print("Digite a medida do lado 1 do triangulo:");
		lado1 =num.nextInt();
		System.out.print("Digite a medida do lado 2 do triangulo:");
		lado2 =num.nextInt();
		System.out.print("Digite a medida do lado 3 do triangulo:");
		lado3 =num.nextInt();
		

	  
	    if(lado1+lado2<lado3 || lado2+lado3<lado1) {
	    	System.out.printf("Medidas erradas,não formam um triangulo");
	    }
	    else if(lado1==lado2 && lado2==lado3) {
	    	System.out.printf("Triangulo equilátero");
	    }
	    else if(lado1==lado2 && lado1 != lado3) {
	    	System.out.printf("Triangulo isóceles");
	    }
	    else  {
	    	System.out.printf("Triangulo escaleno");
	    }
	    
	  num.close();

	}

}

