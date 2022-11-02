package OrientaçãoObjetoLista5b;

import java.util.Scanner;

public class Aluno extends Disciplina{
	Scanner sc = new Scanner(System.in);
	private String nome;
	private String matricula;
	private String cpf;
	private String curso;
	
	public Aluno() {
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void cadastroAluno()  {
		System.out.println("Informe o NOME do aluno: ");
		setNome(sc.next());
		System.out.println("Informe o MATRICULA do aluno: ");
		setMatricula(sc.next());
		System.out.println("Informe o CPF do aluno: ");
		setCpf(sc.next());
		System.out.println("Informe o CURSO do aluno: ");
		setCurso(sc.next());
		
		
	}
	public void mostrarAluno() {
		System.out.println("NOME do aluno: "+ this.nome);
		System.out.println("MATRICULA do aluno: "+this.matricula);
		System.out.println("CPF do aluno: "+ this.cpf);
		System.out.println("CURSO do aluno: "+this.curso);
		
		}
	    
		
	}


