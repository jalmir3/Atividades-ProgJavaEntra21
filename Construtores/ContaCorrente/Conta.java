package OrientaçãoObjetoLista3;
import java.util.Scanner;
public class Conta {
	Scanner sc = new Scanner(System.in);
	private int numeroConta;
    private double saldo;
    private boolean status;
    private float limite;
    public Conta(){}
	public Conta(int numeroConta,double saldo,boolean status,float limite){
		this.numeroConta=numeroConta;
		this.saldo=saldo;
		this.status=status;
		this.limite=limite;
	}
	
    public int getNumeroConta() {
    	return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public double realizarSaque(double saque) {
    	while(saque>(this.saldo+this.limite)) {
    		System.out.println("Saque excede o saldo e limite ");
    		System.out.print("Digite o valor do saque\n");
    		saque=sc.nextDouble();
    	}
    	this.saldo=this.saldo+this.limite-saque;
    	return(this.saldo);
	    
	}
    public double depositarDinheiro(double deposito) {
       this.saldo= this.saldo+ deposito - this.limite;
       return(saldo);
	}
    public void consultarSaldo() {
    	
    	System.out.println("Saldo atual: " + this.saldo );
    }
    public void usarChequeEspecial() {
    	System.out.println("A conta: " + this.numeroConta );
	     if(this.saldo<0) {
	    	 System.out.println("Está usando cheque especial ");
	     }
	     else {
	    	 System.out.println("Não está usando cheque especial ");
	     }
}	
}
