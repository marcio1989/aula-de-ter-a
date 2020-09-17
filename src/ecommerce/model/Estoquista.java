package ecommerce.model;

/**
 * @author marcio
 *
 */
public class Estoquista extends Funcionario {
	// private String nome;
	// private String cpf;
	// private String matricula;
	// private double salario;

	public Estoquista() {

	}

	@Override
	public double bonificacao() {
		return this.getSalario() * 0.5 + this.getSalario();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
