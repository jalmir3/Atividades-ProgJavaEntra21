package OrientaçãoObjetoLista4;

public class Curso {
	private Aluno[] aluno = new Aluno[5];
	private String nome;
	private String horario;
	private float soma;
	private float media;
	
	public Curso() {
	}

	public Curso(String nome, String horario) {
		this.nome = nome;
		this.horario = horario;
	}
    
	public void imprimirDadosAluno() {
		for (int i = 0; i < aluno.length; i++) {
			System.out.println(aluno[i]);
			aluno[i].imprimirSituacaoAluno();
		}
	}

	public void setAluno(int i, Aluno aluno) {
		this.aluno[i] = aluno;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public void mediaTurma() {
		for (int i = 0; i < aluno.length; i++) {
			this.soma += aluno[i].getMedia();
		}
		this.media = this.soma / aluno.length;
		System.out.printf("%nMédia da turma: %.2f%n", this.media);
	}
	
	public String toString() {
		return "\n   Curso de " + this.nome + "\n   Horário: " + " \n  this.horario ";
	}
}
