package OrientaçãoObjetoLista4;

public class Contato {
	private String nome;
	private int telefone;
	private String email;
	
	public Contato(){
	}
	
	public Contato(String nome, int telefone, String email){
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\nTelefone: " + this.telefone + "\nEmail: " + this.email;
}
}