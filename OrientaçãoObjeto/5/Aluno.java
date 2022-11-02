package OrientaçãoObjetoLista4;

public class Aluno {
	private String nome;
	private String matricula;
	private float[] notas = new float[4];
	private float soma;
	private float media;
	
	public Aluno() {
	}

	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public float getMedia() {
		this.media = this.soma / this.notas.length;
		return this.media;
	}

	public void imprimirSituacaoAluno() {
		for (int i = 0; i < this.notas.length; i++) {
			System.out.printf("%dª nota: %.2f%n", (i + 1), this.notas[i]);
			this.soma += this.notas[i];
		}
			System.out.printf("Média: %.2f%n", this.getMedia());
			if(this.media >= 7) {
				System.out.println("Aprovado");}
			else if(this.media < 7) {
				System.out.println("Reprovado");}
			else {
				System.out.println("Média inválida");}
	}

	public void setNotas(int i, float notas) {
		this.notas[i] = notas;
	}
	
	public String toString() {
		return "\nNome: " + this.nome + "\nMatrícula: " + this.matricula;
	}
}
