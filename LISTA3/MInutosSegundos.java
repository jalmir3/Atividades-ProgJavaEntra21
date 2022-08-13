package Lista3;
import java.util.Scanner;
public class MinutosSegundos {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);

	    int hora,minuto,segundo;
	    
	    
	    System.out.print("digite a hora:\n");
	    hora=num.nextInt();
	    
	    
	    minuto=hora*60;
	    segundo=minuto*60;
	    
	    
	    System.out.printf("%d horas tem %d minutos e %d segundos \n",hora,minuto,segundo);
	    
	    

	  num.close();

	}

}
