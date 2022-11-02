package universidade;

public class Professor extends Funcionario {
     String titulacao;
     String areaPesquisa;
      
      //ctrl+3+ggas;
      
      void cadastrarProf(){
      	System.out.print("Digite a titulacao do professor\n");
    		titulacao=num.nextLine();
    		System.out.print("Digite a area de pesquisa do professor\n");
    		areaPesquisa=num.nextLine();
    		
  
     }
}
