package universidade;
import java.util.Scanner;

public class sistemaGestao {
	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		Funcionario func=new Funcionario();
		Aluno alun =new Aluno();
		
		alun.cadastrarAluno();
		
		func.cadastrarFunc();
        
		
		 num.close();
	}
	}


