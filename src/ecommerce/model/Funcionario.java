package ecommerce.model;

/**
 * @author marcio
 *
 */
public class Funcionario {
	protected String nome;
	protected String cpf;
	protected String matricula;
	protected int senha;
	protected double salario;

	public Funcionario() {
	}

	public double bonificacao() {
		this.salario += this.salario * 0.10;
		return this.salario;
	}

	public double salarioBonificado() {
		this.salario += bonificacao();
		return this.salario;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("\nAcesso liberado");
			return true;
		} else {
			System.out.println("\nAcesso negado");
			return false;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
