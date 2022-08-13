package Lista3;
import java.util.Scanner;
public class ReceitaDespesaLucro {

	public static void main(String[] args) {
		 Scanner num= new Scanner(System.in);
		    float receita,despesa,lucro,porcentagem;
		    
		    System.out.print("digite o valor da receita:\n");
		    receita=num.nextInt();
		    System.out.print("digite o valor da despesa:\n");
		    despesa=num.nextInt();
		    
		    lucro =receita - despesa;
		    porcentagem=(despesa*100)/receita;
		    
		    
		    System.out.printf("valor do lucro/despesa:%.2f \n",lucro);
		    System.out.printf("valor da percentagem da despesa:%.1f %%",porcentagem);
		    

		  num.close();
	}

}
