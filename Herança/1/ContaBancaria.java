package OrientaçãoObjetoLista5;

import java.util.Scanner;

public class ContaBancaria {
	Scanner sc = new Scanner(System.in); 
       private String nomeCliente;
       private String numConta;
       private float saldo;
    public ContaBancaria() {}
    public ContaBancaria(String nomeCliente,String numConta,float saldo){
       this.nomeCliente=nomeCliente;
       this.numConta=numConta;
       this.saldo=saldo;
    }
    public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
    public float sacar(float saque)  {
    	while(saque>this.saldo) {
    		System.out.println("Saque excede o saldo");
    		System.out.print("Digite o valor do saque\n");
    		saque=sc.nextFloat();
    }
    	this.saldo=this.saldo-saque;
    	return(this.saldo);
	}
    
    public float depositar(float deposito) {
    	this.saldo= this.saldo+ deposito;
        return(this.saldo);
    }
    public void consultarSaldo() {
    	System.out.println("Saldo atual conta corrente: " + this.saldo );
    }
    
}

