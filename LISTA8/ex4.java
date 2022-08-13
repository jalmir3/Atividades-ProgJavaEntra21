package lista8;

import java.util.Scanner;

public class ex4 {
public static void main(String[] args) {
	Scanner num = new Scanner(System.in);
	String compromisso[][]= new String [30][24];
	int opcao,dia,hora;

    
	do{
	System.out.print("1=Agendar compromisso\n2=Verificar compromisso\n0=Sair ");
	
	opcao=num.nextInt();
	
	switch(opcao) {
	case 1:
		System.out.print("Digite o dia do compromisso\n");
		dia=num.nextInt();
		System.out.print("Digite a hora do compromisso\n");
		hora=num.nextInt();
		num = new Scanner(System.in);
		System.out.print("Digite o compromisso\n");
		compromisso[dia-1][hora]=num.nextLine();
		break;
		
    case 2:
    	System.out.print("Digite o dia\n");
		dia=num.nextInt();
		System.out.print("Digite a hora\n");
		hora=num.nextInt();
		if(compromisso[dia-1][hora]==null) {
			System.out.print("Sem compromissos para esse dia\n");
			break;
		}
		else {
			System.out.printf("Compromisso %s\n",compromisso[dia-1][hora]);
		}
		break;
		
	case 0:
		System.out.print("Programa encerrado\n");
		break;
	default:
		System.out.print("Opcao invalida,digite novamente!!\n");
		break;
	}
	}while(opcao==1 || opcao==2);
	 num.close();
}
}
