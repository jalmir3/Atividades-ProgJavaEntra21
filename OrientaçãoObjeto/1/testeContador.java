package OrientaçãoObjetoLista4;

public class testeContador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador contar = new Contador();
		
		System.out.println(Contador.getCont());
		
		Contador contar2 = new Contador();
		
		System.out.println(Contador.getCont());
		
		Contador.incrementar();
		
		System.out.println(Contador.getCont());
		
		Contador.zerar();
		
		System.out.printf("%d\n", Contador.getCont());
		
		
	}

}
