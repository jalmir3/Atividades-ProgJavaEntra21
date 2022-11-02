package Lista7TratamentoDeExcessoes;

import java.util.Scanner;

public class Conta{
	Scanner sc = new Scanner(System.in);
       public String numero;
       public float saldo;
       public float limite;
       public float saque;
       public float deposito;
       
       public void sacar() throws ContaExcessao {
    	   if(saque>saldo) {
    		   throw new ContaExcessao();
    	   }
    	   else {
    		   System.out.println("Saque efetuado com sucesso,valor sacado é de R$ " + this.saque);
    	   }
       }

}