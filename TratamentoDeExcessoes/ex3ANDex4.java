package Lista7TratamentoDeExcessoes;

import java.util.Scanner;

public class ex3ANDex4 {
	public static void main(String[] args) throws ContaExcessao  {
		   Scanner sc = new Scanner(System.in);
		Conta minhaConta=new Conta();
		//ContaExcessao saldoRecuperado= new ContaExcessao();//Modificação p/ ex.4
		minhaConta.deposito=(100);
		minhaConta.saldo=(1000);
		minhaConta.limite=(100);
		
		
		try {
			minhaConta.saque=1500;
			minhaConta.sacar();
		} 
		catch (ContaExcessao x) {
			//saldoRecuperado.saldo=minhaConta.saldo;//Modificação p/ ex.4
			System.out.println(x.getMessage());
			System.out.printf("Digite um valor menor que %.1f reais:",minhaConta.saldo);
			minhaConta.saque= sc.nextFloat();
		}
		minhaConta.saldo=minhaConta.saldo-minhaConta.saque+minhaConta.deposito;
		System.out.println("Saldo atual:"+minhaConta.saldo);
		System.out.println("Limite:"+minhaConta.limite);
		//System.out.println("Saldo recuperado:"+saldoRecuperado.saldo);//Modificação p/ ex.4
		}
	}


