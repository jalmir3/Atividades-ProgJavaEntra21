package OrientaçãoObjetoLista5b;

import java.util.Scanner;

public class GestaoUniversidade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float valDedicExclu=0,retribTitul=0,auxTransp=0,auxAliment=0;
		float qntHora=0,valorHora=0,TotalTec,TotalProf;
		int opcao=0,opcao1=0;
		Aluno aluno = new Aluno();
		Professor prof = new Professor();
		TecnicoAdm tec = new TecnicoAdm();
		Curso curso = new Curso();
		Disciplina disciplina = new Disciplina();
		do {
			System.out.println("Digite a Opcao desejada");
			System.out.printf("\n1-CADASTRAR ALUNO\n2-CADASTRAR PROFESSOR\n3-CADASTRAR TECNICO ADMINISTRATIVO\n4-CADASTRAR CURSO\n5-CADASTRAR DISCIPLINA\n6-MOSTRAR DADOS CADASTRADOS\n");
			opcao=sc.nextInt();
			switch(opcao) {
			case 1:
				aluno.cadastroAluno();
				break;
			case 2:
				prof.cadastroProfessor();
				System.out.print("Digite o Valor Dedicacao Exclusiva\n");
				valDedicExclu=sc.nextFloat();
				System.out.print("Digite o valor Retribuicao Titulacao\n");
				retribTitul=sc.nextFloat();
				break;
			case 3:
				tec.cadastroTecnico();
				System.out.print("Digite o valor Auxilio Transporte\n");
				auxTransp=sc.nextFloat();
				System.out.print("Digite o valor Auxilio Alimentacao\n");
				auxAliment=sc.nextFloat();
				System.out.print("Digite a qtd de horas extras do mes\n");
				qntHora=sc.nextFloat();
				break;
			case 4:
				curso.cadastroCurso();
				break;
			case 5:
				disciplina.cadastroDisciplna();
				break;
				}
			
		}while(opcao!=6);
		do {
			System.out.printf("\n1-MOSTRAR DADOS ALUNO\n2-MOSTRAR DADOS PROFESSOR\n3-MOSTRAR DADOS TECNICO ADMINISTRATIVO\n4-MOSTRAR DADOS CURSO\n5-MOSTRAR DADOS DISCIPLINA\n6-SAIR\n");
			opcao1=sc.nextInt();
			switch(opcao1) {
			case 1:
				aluno.mostrarAluno();
				System.out.println("DISCIPLINA do aluno: "+disciplina.NomeDisc);
				break;
			case 2:
				prof.mostrarProfessor();
				System.out.println("Professor ministra curso: "+curso.nome);
				TotalProf=prof.calcSalario(valDedicExclu, retribTitul);
				System.out.println("SALARIO do Professor com os beneficios: "+TotalProf);
				
				break;
			case 3:
				valorHora=tec.getSalario()/220;
				tec.calcSalario(auxTransp, auxAliment);
			    tec.mostrarTecnico();
				TotalTec=tec.calcSalario(qntHora, valorHora)+tec.calcSalario1(auxTransp, auxAliment);
				System.out.println("SALARIO do Tecnico Adm com os beneficios e horas extras: "+TotalTec);
				break;
			case 4:
				curso.mostrarCurso();
				break;
			case 5:
				disciplina.mostrarDisciplina();
				break;
			case 6:
				System.out.println("SAINDO!!");
				break;
			}
		}while(opcao1!=6);
		
		
		
		
		
		
		

		
		
		

	}

}
