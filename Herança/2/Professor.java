package OrientaçãoObjetoLista5b;

import java.util.Scanner;

public class Professor extends Funcionario{
Scanner sc = new Scanner(System.in);
private String titulacao;
private String areaPesquisa;
public Professor() {
	}
public Professor(String titulacao, String areaPesquisa) {
		this.titulacao = titulacao;
		this.areaPesquisa = areaPesquisa;
	} 
public String getTitulacao() {
	return titulacao;
}
public void setTitulacao(String titulacao) {
	this.titulacao = titulacao;
}
public String getAreaPesquisa() {
	return areaPesquisa;
}
public void setAreaPesquisa(String areaPesquisa) {
	this.areaPesquisa = areaPesquisa;
}
public void cadastroProfessor()  {
	System.out.println("Informe o NOME do Professor: ");
	setNome(sc.next());
	System.out.println("Informe o ENDERECO do Professor: ");
	setEndereco(sc.next());
	System.out.println("Informe o TELEFONE do Professor: ");
	setTelefone(sc.next());
	System.out.println("Informe o CPF do Professor: ");
	setCpf(sc.next());
	System.out.println("Informe o CTPS do Professor: ");
	setCtps(sc.next());
	System.out.println("Informe o SALARIO do Professor: ");
	setSalario(sc.nextFloat());
	System.out.println("Informe a TITULACAO do Professor: ");
	setTitulacao(sc.next());
	System.out.println("Informe o AREA_DE_PESQUISA do Professor: ");
	setAreaPesquisa(sc.next());
	
}
public float calcSalario(float valDedicExclu,float retribTitul) {
     float salarioProfessor=this.getSalario()+valDedicExclu+retribTitul;
	 return salarioProfessor;
}
public void mostrarProfessor() {
	System.out.println("NOME do Professor: "+ this.getNome());
	
	System.out.println("ENDERECO do Professor: " +this.getEndereco());
	
	System.out.println("TELEFONE do Professor: "+this.getTelefone());
	
	System.out.println("CPF do Professor: "+ this.getCpf());
	
	System.out.println("CTPS do Professor: "+ this.getCtps());
	
	System.out.println("SALARIO BASE do Professor: "+this.getSalario());
	
	System.out.println("TITULACAO do Professor: "+this.titulacao);

	System.out.println("AREA_DE_PESQUISA do Professor: "+this.areaPesquisa);
	
}
}
