package OrientaçãoObjetoLista5b;

import java.util.Scanner;

public class TecnicoAdm extends Funcionario{
Scanner sc = new Scanner(System.in);
   private String cargo;
   private String depto;
   
public TecnicoAdm() {
   	}
public TecnicoAdm(String cargo, String depto) {
   		this.cargo = cargo;
   		this.depto = depto;
   	} 
public String getCargo() {
	return cargo;
}
public void setCargo(String cargo) {
	this.cargo = cargo;
}
public String getDepto() {
	return depto;
}
public void setDepto(String depto) {
	this.depto = depto;
}
public void cadastroTecnico()  {
	System.out.println("Informe o NOME do tecnico: ");
	setNome(sc.next());
	System.out.println("Informe o ENDERECO do tecnico: ");
	setEndereco(sc.next());
	System.out.println("Informe o TELEFONE do tecnico: ");
	setTelefone(sc.next());
	System.out.println("Informe o CPF do tecnico: ");
	setCpf(sc.next());
	System.out.println("Informe o CTPS do tecnico: ");
	setCtps(sc.next());
	System.out.println("Informe o SALARIO do tecnico: ");
	setSalario(sc.nextFloat());
	System.out.println("Informe a CARGO do tecnico: ");
	setCargo(sc.next());
	System.out.println("Informe o DEPTO do tecnico: ");
	setDepto(sc.next());
	
}

public float calcSalario1(float auxTransp ,float auxAliment) {
	   float salarioTecnico;
	   salarioTecnico=this.getSalario()+auxTransp+auxAliment;
	   return salarioTecnico;
}
@Override
public float calcSalario(float qntHora, float valorHora) {
	   float somaHorasExtras = qntHora * valorHora;
	   return somaHorasExtras;
}
public void mostrarTecnico() {
	System.out.println("NOME do tecnico: "+this.getNome());
	
	System.out.println("ENDERECO do tecnico: "+this.getEndereco());

	System.out.println("TELEFONE do tecnico: "+this.getTelefone());
	
	System.out.println("CPF do tecnico: "+this.getCpf());
	
	System.out.println("CTPS do tecnico: "+this.getCtps());

	System.out.println("SALARIO BASE do tecnico: "+this.getSalario());
    
	System.out.println("CARGO do tecnico: "+this.cargo);
	
	System.out.println("DEPTO do tecnico: "+this.depto);

}
}
