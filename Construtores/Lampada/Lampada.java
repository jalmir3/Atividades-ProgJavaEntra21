package OrientaçãoObjetoLista3;

public class Lampada {
	private String marca;
	private String tipo;
	private double potencia;
	private int voltagem;
	private boolean ligada;
	Lampada(){}
	Lampada(String marca,String tipo,double potencia,int voltagem,boolean ligada){
		this.marca=marca;
		this.tipo=tipo;
		this.potencia=potencia;
		this.voltagem=voltagem;
		this.ligada=ligada;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
    public void ligarLampada() {
	    this.ligada=true;
		System.out.println(" Lampada ligada!!! " );
	}
    public void desligarLampada() {
	this.ligada=false;
	System.out.println(" Lampada Desligada!!! " );
		}
    public void mostrarEstado() {
	if(this.ligada) {
		System.out.println(" Status ligada!!! " );
	}
	else {
		System.out.println(" Status Desligada!!! " );
	}
}
    public void mudarEstado() {
	this.ligada=!this.ligada;
	if(this.ligada) {
		System.out.println(" Status ligada!!! " );
	}
	else {
		System.out.println(" Status Desligada!!! " );
	}
}	

}
