package Lista3;
import java.util.Scanner;
public class DiasVividos {

	public static void main(String[] args) {
		 Scanner num= new Scanner(System.in);
		    String nome;
		    int idade,viveu;
		    
		    System.out.print("digite seu nome:\n");
		    nome =num.nextLine();
		    System.out.print("digite sua idade:\n");
		    idade=num.nextInt();
		    
		    
		    viveu=idade *365;
		    
		    
		    System.out.printf(" %s já viveu %d dias \n",nome,viveu);
		    
		    

		  num.close();
	}

}
