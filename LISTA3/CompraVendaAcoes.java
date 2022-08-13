package Lista3;
import java.util.Scanner;
public class CompraVendaAcoes {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    double valorcompra,totalvenda,percentualcompra,percentualvenda,lucro;
	    
	    System.out.print("digite a quantidade de açoes:");
	    int qtdacoes=num.nextInt();
	    
	    valorcompra=32.87*qtdacoes;
	    totalvenda=33.92*qtdacoes;
	    percentualcompra=valorcompra*0.02;
	    percentualvenda=totalvenda*0.02;
	    lucro=totalvenda-valorcompra-percentualcompra-percentualvenda;
	    
	    
	    System.out.printf("Valor de compra:%.2f\nPorcentagem compra:%.2f\nValor de venda:%.2f\nPorcentagem venda:%.2f\nLucro ou despesa:%.2f",valorcompra,percentualcompra,totalvenda,percentualvenda,lucro);
	    

	  num.close();

	}

}
