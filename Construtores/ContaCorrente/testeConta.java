package OrientaçãoObjetoLista3;
import java.util.Scanner;

public class testeConta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta=new Conta();
	    double saque=0,deposito=0;
	    
	    conta.setSaldo(10000);
		conta.setNumeroConta(12345);
		conta.setLimite(1000);
		
		System.out.print("Digite o valor do saque\n");
		saque=sc.nextDouble();
		
        conta.realizarSaque(saque);
        
        System.out.print("Digite o valor do deposito\n");
		deposito=sc.nextDouble();
		
        conta.depositarDinheiro(deposito);
        
        conta.consultarSaldo();
        
        conta.usarChequeEspecial();
	}

}
