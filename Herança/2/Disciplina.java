package OrientaçãoObjetoLista5b;

import java.util.Scanner;

public class Disciplina extends Curso{
	Scanner sc = new Scanner(System.in);
    protected int codDisc;
    protected String NomeDisc;
    protected int cargaHS;
    public Disciplina() {}
    public Disciplina(String nomeDisc, int codDisc, int cargaHS) {
		this.NomeDisc = nomeDisc;
		this.codDisc = codDisc;
		this.cargaHS = cargaHS;
	}
    public int getCodDisc() {
		return codDisc;
	}
	public void setCodDisc(int codDisc) {
		this.codDisc = codDisc;
	}
	public String getNomeDisc() {
		return NomeDisc;
	}
	public void setNomeDisc(String nomeDisc) {
		NomeDisc = nomeDisc;
	}
	public int getCargaHS() {
		return cargaHS;
	}
	public void setCargaHS(int cargaHS) {
		this.cargaHS = cargaHS;
	}
	public void cadastroDisciplna()  {
		System.out.println("Informe o CODIGO da disciplina: ");
		codDisc=sc.nextInt();
		System.out.println("Informe o NOME da disciplina: ");
		NomeDisc=sc.next();
		System.out.println("Informe o CARGA HORARIA da disciplina: ");
		cargaHS=sc.nextInt();
		}
	
	public void mostrarDisciplina() {
		System.out.println("NOME da disciplina: "+ this.NomeDisc);
		System.out.println("CODIGO da disciplina: "+this.codDisc);
		System.out.println("CARHA HORARIA da disciplina: "+ this.cargaHS);
		}
		}
		
	
 

	
	