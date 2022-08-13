package Lista5;

import java.util.Scanner;

public class FormaPagamento {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    double valor,desconto;
	    char metodo;
	    
	    
	    System.out.print("digite o valor da compra:\n");
	    valor =num.nextDouble();
	    System.out.print("digite a forma de pagamento[C=cheque ou D=dinheiro]:\n");
	    metodo =num.next().charAt(0);
	    //String metodo.num.next().
	    //if(valor>99  && metodo.equalsIgnoreCase("dinheiro"))
	    if(valor>99  && metodo=='D'|| metodo=='d') {
	    	desconto=valor-(valor*0.1);
	    	
	    	System.out.printf("Valor a ser pago:%.2f reais\n",desconto);
	    }
	    else  {
	    	System.out.printf("Valor a ser pago:%.2f reais\n",valor);
	    }
	    
	    
	  num.close();

	}

}

