package OrientaçãoObjetoLista5;


public class contaEspecial extends ContaBancaria{
      private float limite;

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	@Override
    public float sacar(float saque) {
		while(saque>this.limite) {
    		System.out.println("Saque excede o saldo");
    		System.out.print("Digite o valor do saque\n");
    		saque=sc.nextFloat();
    }
    	this.limite=this.limite-saque;
    	return(this.limite);
	}
	public void mostrarSaldoLimite() {
		System.out.println("Saldo atual limite: " + this.limite );
	}
	}
    
