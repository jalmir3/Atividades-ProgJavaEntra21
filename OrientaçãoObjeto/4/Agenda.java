package OrientaçãoObjetoLista4;

public class Agenda {
	private final Contato[] contato;
	
	public Agenda() {
		this.contato = new Contato[3];
	}
	public Agenda(String nome) {
		this.contato = new Contato[3];
	}

	public Contato getContato(int i) {
		return this.contato[i];
	}

	public void setContato(int i, Contato contato) {
		this.contato[i] = contato;
	}
	
	public void exibirContatos() {
		for (Contato cont : this.contato) {
			System.out.println(cont);
			System.out.println(" ");
		}
}
}