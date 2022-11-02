package OrientaçãoObjetoLista5b;

abstract class Funcionario {
	private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String ctps;
    private float salario;
    
    public Funcionario() {
	}
    public Funcionario(String nome, String endereco, String telefone, String cpf,String ctps, float salario) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.ctps = ctps;
		this.salario = salario;
	}
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCtps() {
		return ctps;
	}
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public abstract float calcSalario(float a, float b); 
		
}
    