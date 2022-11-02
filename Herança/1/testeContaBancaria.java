package OrientaçãoObjetoLista5;
import java.util.Scanner;
public class testeContaBancaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		float saque,deposito,taxa;
		int opcao;
		ContaBancaria conta= new ContaBancaria();
		System.out.print("\nInforme o nome do Cliente:");
		conta.setNomeCliente(sc.next());
		System.out.printf("\nInforme o numero da conta do Cliente %s:",conta.getNomeCliente());
		conta.setNumConta(sc.next());
		System.out.printf("\nInforme o saldo da conta do Cliente %s:",conta.getNomeCliente());
		conta.setSaldo(sc.nextFloat());
		
		contaPoupanca contaPoupanca= new contaPoupanca();
		System.out.print("\nInforme o numero da conta poupanca:");
		contaPoupanca.setNumConta(sc.next());
		System.out.print("\nInforme o saldo da conta poupanca:");
		contaPoupanca.setSaldo(sc.nextFloat());
		
		contaEspecial especial = new contaEspecial();
		System.out.print("\nInforme o numero da conta especial:");
		especial.setNumConta(sc.next());
		System.out.print("\nInforme o limite da conta especial:");
		especial.setLimite(sc.nextFloat());
		
		do {
		System.out.print("\nDigite\n1-sacar Conta Corrente\n2-Depositar Conta Corrente\n3-Informar rendimento Conta Poupança\n4-Mostrar Contas e Saldos Atualizados\n5-Sacar do Limite\n");
		opcao=sc.nextInt();
		switch(opcao) {
		case 1:
			System.out.print("\nInforme o valor do saque:");
			saque=sc.nextFloat();
			conta.sacar(saque);
		break;
		case 2:
			System.out.print("Informe o valor do deposito\n");
			deposito=sc.nextFloat();
			conta.depositar(deposito);
		break;
		case 3:
			System.out.print("Informe a taxa de juros do mes\n");
			taxa=sc.nextFloat();
			contaPoupanca.calcularNovoSaldo(taxa);
	    break;
		case 4:
			System.out.print("Cliente=" +conta.getNomeCliente()+"\nNumero da conta corrente=" + conta.getNumConta() + "\nSaldo=" + conta.getSaldo());
			System.out.print("\nNumero da conta poupanca=" + contaPoupanca.getNumConta() + "\nSaldo=" + contaPoupanca.getDiaRendimento());
			System.out.print("\nNumero da conta especial=" + especial.getNumConta() + "\nSaldo=" + especial.getLimite());
		break;
		case 5:
			System.out.print("\nInforme o valor do saque:");
			saque=sc.nextFloat();
			especial.sacar(saque);
		break;
		}}while(opcao!=4);
		sc.close();
	}
  
}
