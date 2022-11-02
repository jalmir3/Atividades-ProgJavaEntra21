package OrientaçãoObjetoLista4;

public class Contador {
	
	static private int cont;
	
	public Contador() {
		this.cont++;
	}
	
	public Contador(int cont) {
		this.cont += cont;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Contador.cont = cont;
	}

	public static void incrementar() {
		cont++;
	}
	
	public static void zerar() {
		Contador.cont = 0;
	}
	
}
