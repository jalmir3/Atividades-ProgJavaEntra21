package Lista3;
import java.util.Scanner;
public class AreaQuadrado {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
	    int area,lado;
	    
	    System.out.print("digite o valor do lado do quadrado:\n");
	    lado=num.nextInt();
	    
	    
	    area =lado *lado;
	    
	    
	    System.out.printf("valor da area:%d ",area);
	    

	  num.close();
	}

}
