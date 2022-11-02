package universidade;
import java.util.Scanner;
public class Funcionario {
Scanner num = new Scanner(System.in);

      String nome;
      String endereco;
      String cpf;
      String telefone;
      String numCTPS;
      float salario;
      
      void cadastrarFunc(){
    	System.out.print("Digite o nome do funcionario\n");
  		nome=num.nextLine();
  		System.out.print("Digite o endereço do funcionario\n");
  		endereco=num.nextLine();
  		System.out.print("Digite o cpf do funcionario\n");
  		cpf=num.nextLine();
  		System.out.print("Digite o telefone do funcionario\n");
  		telefone=num.nextLine();
  		System.out.print("Digite o numero CTPS do funcionario\n");
  		numCTPS=num.nextLine();
  		System.out.print("Digite o salario do funcionario\n");
  		salario=num.nextFloat();
      }
}
