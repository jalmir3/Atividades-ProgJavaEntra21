package Lista7TratamentoDeExcessoes;

public class ContaExcessao extends Exception{
	//float saldo;
	public String getMessage(){
		
		return "ERRO!!Saque maior que o Saldo disponivel!!!!!!";
	  }
}
