package ecommerce.model;

/**
 * @author marcio
 *
 */
public class Gerente extends Funcionario {
	// protected int senha;
	private int numeroDeFuncionarioQueEleGerencia;

	public Gerente() {

	}

	@Override
	public double bonificacao() {
		return this.getSalario() * 0.12 + this.getSalario();
	}

//	public int getSenha() {
//		return senha;
//	}
//	public void setSenha(int senha) {
//		this.senha = senha;
//	}
	public int getNumeroDeFuncionarioQueEleGerencia() {
		return numeroDeFuncionarioQueEleGerencia;
	}

	public void setNumeroDeFuncionarioQueEleGerencia(int numeroDeFuncionarioQueEleGerencia) {
		this.numeroDeFuncionarioQueEleGerencia = numeroDeFuncionarioQueEleGerencia;
	}

}
