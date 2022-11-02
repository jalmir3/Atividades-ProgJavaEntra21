package OrientaçãoObjetoLista4;
import java.util.Scanner;
public class testeNotasAluno {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		Curso curso = new Curso();
		System.out.print("Informe o nome do curso: ");
		curso.setNome(sc.next());
		System.out.print("Digite o horário do curso: ");
		curso.setHorario(sc.next());
		
		Professor prof= new Professor();
		
		System.out.print("Informe o nome do Professor: ");
		prof.setNome(sc.next());
		System.out.print("Informe o departamento do Professor: ");
		prof.setDepartamento(sc.next());
		System.out.print("Informe o email do Professor: ");
		prof.setEmail(sc.next());
		
		
		Aluno aluno1 = new Aluno();
		System.out.print("\nInforme o nome do aluno 1: ");
		aluno1.setNome(sc.next());
		System.out.print("Informe a matrícula: ");
		aluno1.setMatricula(sc.next());
		for (int i = 0; i < 4; i++) {
			System.out.printf("Informe a %dª nota do aluno %s: ", i+1,aluno1.getNome());
			aluno1.setNotas(i, sc.nextFloat());
		}
		Aluno aluno2 = new Aluno();
		System.out.print("\nInforme o nome do aluno 2: ");
		aluno2.setNome(sc.next());
		System.out.print("Informe a matrícula: ");
		aluno2.setMatricula(sc.next());
		for (int i = 0; i < 4; i++) {
			System.out.printf("Informe a %dª nota do aluno %s: ", i+1,aluno2.getNome());
			aluno2.setNotas(i, sc.nextFloat());
		}
		Aluno aluno3 = new Aluno();
		System.out.print("\nInforme o nome do aluno 3: ");
		aluno3.setNome(sc.next());
		System.out.print("Informe a matrícula: ");
		aluno3.setMatricula(sc.next());
		for (int i = 0; i < 4; i++) {
			System.out.printf("Informe a %dª nota do aluno %s: ", i+1,aluno3.getNome());
			aluno3.setNotas(i, sc.nextFloat());
		}
		Aluno aluno4 = new Aluno();
		System.out.print("\nInforme o nome do aluno 4: ");
		aluno4.setNome(sc.next());
		System.out.print("Informe a matrícula: ");
		aluno4.setMatricula(sc.next());
		for (int i = 0; i < 4; i++) {
			System.out.printf("Informe a %dª nota do aluno %s: ", i+1,aluno4.getNome());
			aluno4.setNotas(i, sc.nextFloat());
		}
		Aluno aluno5 = new Aluno();
		System.out.print("\nInforme o nome do aluno 5: ");
		aluno5.setNome(sc.next());
		System.out.print("Informe a matrícula: ");
		aluno5.setMatricula(sc.next());
		for (int i = 0; i < 4; i++) {
			System.out.printf("Informe a %dª nota  do aluno %s: ", i+1,aluno5.getNome());
			aluno5.setNotas(i, sc.nextFloat());
		}
		
		curso.setAluno(0, aluno1);
		curso.setAluno(1, aluno2);
		curso.setAluno(2, aluno3);
		curso.setAluno(3, aluno4);
		curso.setAluno(4, aluno5);
		
		System.out.println(prof);
		System.out.println(curso);
		curso.imprimirDadosAluno();
		curso.mediaTurma();
		

	}

}
