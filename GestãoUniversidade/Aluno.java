package universidade;
import java.util.Scanner;
public class Aluno {
	Scanner num = new Scanner(System.in);
        String nome;
        int matricula;
        String cpf;
        String curso;
        
        void cadastrarAluno(){
        	System.out.print("Digite o nome do aluno\n");
      		nome=num.nextLine();
      		System.out.print("Digite a matricula do aluno\n");
      		matricula=num.nextInt();
      		System.out.print("Digite o cpf do aluno\n");
      		cpf=num.next();
      		System.out.print("Digite o curso do aluno\n");
      		curso=num.next();
      		
          }
}
