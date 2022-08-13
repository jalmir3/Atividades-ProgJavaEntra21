package lista8;

import java.util.Scanner;

public class ex5 {
public static void main(String[] args) {
	Scanner num = new Scanner(System.in);
	String compromisso[][][]= new String [30][12][8];
	int opcao,dia,hora,mes;

    
	do{
	System.out.print("1=Agendar compromisso\n2=Verificar compromisso\n0=Sair ");
	
	opcao=num.nextInt();
	
	switch(opcao) {
	case 1:
		System.out.print("Digite o dia do compromisso\n");
		dia=num.nextInt();
		System.out.print("Digite o mes do compromisso\n");
		mes=num.nextInt();
		System.out.print("Digite a hora do compromisso\n");
		hora=num.nextInt();
		num = new Scanner(System.in);
		System.out.print("Digite o compromisso\n");
		compromisso[dia+1][mes][hora]=num.nextLine();
		break;
		
    case 2:
    	System.out.print("Digite o dia\n");
		dia=num.nextInt();
		System.out.print("Digite o mes\n");
		mes=num.nextInt();
		System.out.print("Digite a hora\n");
		hora=num.nextInt();
		if(compromisso[dia+1][mes][hora]==null) {
			System.out.print("Sem compromissos para esse dia\n");
			break;
		}
		else {
			System.out.printf("Compromisso %d/%d as %d:00hs: %s\n",dia+1,mes,hora,compromisso[dia-1][mes][hora]);
		}
		break;
		
	case 0:
		System.out.print("Programa encerrado\n");
		break;
	default:
		System.out.print("Opcao invalida,digite novamente!!\n");
		break;
	}
	}while(opcao!=0);
	 num.close();
}
}
