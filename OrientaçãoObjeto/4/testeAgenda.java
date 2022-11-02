package OrientaçãoObjetoLista4;
import java.util.Scanner;

public class testeAgenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Agenda agenda=new Agenda();
		
		Contato con1 = new Contato();
		System.out.println("Contato 1 ");
		System.out.print("Nome: ");
		con1.setNome(sc.next());
		System.out.print("Telefone: ");
		con1.setTelefone(sc.nextInt());
		System.out.print("Email: ");
		con1.setEmail(sc.next());
		
		Contato con2 = new Contato();
		System.out.println("Contato 2 ");
		System.out.print("\nNome: ");
		con2.setNome(sc.next());
		System.out.print("Telefone: ");
		con2.setTelefone(sc.nextInt());
		System.out.print("Email: ");
		con2.setEmail(sc.next());
		
		Contato con3 = new Contato();
		System.out.println("Contato 3 ");
		System.out.print("\nNome: ");
		con3.setNome(sc.next());
		System.out.print("Telefone: ");
		con3.setTelefone(sc.nextInt());
		System.out.print("Email: ");
		con3.setEmail(sc.next());
	
		agenda.setContato(0, con1);
		agenda.setContato(1, con2);
		agenda.setContato(2, con3);
		
		agenda.exibirContatos();
		

	}

}
