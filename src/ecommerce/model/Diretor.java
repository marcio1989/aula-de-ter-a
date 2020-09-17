package ecommerce.model;

/**
 * @author marcio
 *
 */
public class Diretor extends Funcionario {
	private boolean percentualDeLucro;
	private int NumerosDeGerentes;

	public Diretor() {

	}

	@Override
	public double bonificacao() {
		return this.getSalario() * 0.15 + this.getSalario();
	}

	public boolean getPercentualDeLucro() {
		return percentualDeLucro;
	}

	public void setPercentualDeLucro(boolean percentualDeLucro) {
		this.percentualDeLucro = percentualDeLucro;
	}

	public int getNumerosDeGerentes() {
		return NumerosDeGerentes;
	}

	public void setNumerosDeGerentes(int numerosDeGerentes) {
		NumerosDeGerentes = numerosDeGerentes;
	}

}
