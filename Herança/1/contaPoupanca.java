package OrientaçãoObjetoLista5;


public class contaPoupanca extends ContaBancaria{
	private float diaRendimento;

	public float getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(float diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	public float calcularNovoSaldo(float taxa) {
	    this.diaRendimento=(taxa*this.getSaldo())/100+(this.getSaldo());
	    return this.diaRendimento;
	}
}
