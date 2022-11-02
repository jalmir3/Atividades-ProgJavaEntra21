package OrientaçãoObjetoLista3;
import java.util.Scanner;

	public class Aluno {
		
		private Scanner sc = new Scanner(System.in);
		private int matricula;
		private String nome;
		private String curso;
		private String materia[]= new String [3];
		private float nota[][]= new float[3][3];
		private float soma;
		private float media[]=new float[3];
		
		public Aluno() {}
		
		public Aluno(String nome, String curso, float soma, int matricula){
			this.nome = nome;
			this.curso = curso;
			this.soma = soma;
			this.matricula = matricula;
		}
		public String getDisciplina(int i) {
			return materia[i];
		}

		public void setDisciplina(int i, String disciplina) {
			this.materia[i] = disciplina;
		}

		public double getNota(int i, int j) {
			return nota[i][j];
		}

		public void setNota(int i, int j, float nota) {
			this.nota[i][j] = nota;
		}

		public double getMedia(int i) {
			return media[i];
		}

		public void setMedia(int i,float media) {
			this.media[i] = media;
		}

		public double getSoma() {
			return soma;
		}

		public void setSoma(float soma) {
			this.soma = soma;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCurso() {
			return curso;
		}

		public void setCurso(String curso) {
			this.curso = curso;
		}

		public int getMatricula() {
			return matricula;
		}

		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}

		public void digitarDados() {
			System.out.print("Informe o nome do aluno:");
			this.nome = sc.nextLine();
			System.out.print("Informe o número de matrícula:");
			this.matricula = sc.nextInt();
			System.out.print("Informe o curso do aluno:");
			this.curso = sc.next();
			for (int i = 0; i < 3; i++) {
				this.soma = 0;
				System.out.print("\nInforme o nome da matéria: ");
				this.materia[i] = sc.next();
				for (int j = 0; j < 3; j++) {
					System.out.print("Informe a " + (j+1) + "ª nota obtida: ");
					this.nota[i][j] = sc.nextFloat();
					soma += this.nota[i][j];
				}
				this.media[i]= this.soma / 3;
				sc.nextLine();
			}
			sc.close();
		}
		public void exibirResultado() {
			System.out.printf("Nome:%s \n" ,this.nome);
			System.out.printf("Matrícula:%d \n" , this.matricula);
			System.out.printf("Curso: %s \n" , this.curso);
			for (int i = 0; i < 3; i++) {
				System.out.printf("\nMatéria:%s \n" ,this.materia[i]);
				for (int j = 0; j < 3; j++) {
					System.out.printf("Nota %d : %f \n" ,j+1, this.nota[i][j]);
			}
				System.out.printf("Média: %.2f \n", this.media[i]);
				if(this.media[i] >= 7) {
					System.out.print("\nSituação: Aprovado\n");}
				else {
					System.out.print("\nSituação: Reprovado\n");}

			}
		}
		
	}

