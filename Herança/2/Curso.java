package OrientaçãoObjetoLista5b;

import java.util.Scanner;

public class Curso extends Professor{
	Scanner sc = new Scanner(System.in);
	protected int codCurso;
	protected String nome;
	protected int duracao;
	public int getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public void cadastroCurso()  {
		System.out.println("Informe o CODIGO do curso: ");
		setCodCurso(sc.nextInt());
		System.out.println("Informe o NOME do curso: ");
		setNome(sc.next());
		System.out.println("Informe o DURACAO do curso: ");
		setDuracao(sc.nextInt());
	}
	public void mostrarCurso() {
		System.out.println("NOME do curso: "+ this.nome);
		System.out.println("CODIGO do curso: "+this.codCurso);
		System.out.println("DURACAO do curso: "+ this.duracao);
		}
}
