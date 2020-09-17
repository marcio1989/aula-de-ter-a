/**
 * 
 */
package ecommerce;

import ecommerce.model.Diretor;
import ecommerce.model.Estoquista;
import ecommerce.model.Gerente;

/**
 * @author marcio
 *
 */
public class Main {
	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setNome("Marcio");
		g.setCpf("016.955.584.21");
		g.setMatricula("1313");
		g.setSenha(123);
		g.setSalario(1000);
		System.out.println("Nome:  " + g.getNome() + "\nCPF: " + g.getCpf() + "\nMatrícula: " + g.getMatricula()
				+ "\nSalário bonificado do Gerente R$: " + g.salarioBonificado() + "\nStatus: " + g.autentica(123));

		Diretor d = new Diretor();
		d.setNome("Magno");
		d.setCpf("076.144.351.91");
		d.setMatricula("1414");
		d.setSenha(123);
		d.setSalario(10000);
		System.out.println("Nome: " + d.getNome() + "\nCPF: " + d.getCpf() + "\nMatrícula: " + d.getMatricula()
				+ "\nSalário bonificado do Diretor R$ " + d.salarioBonificado() + "\nStatus: " + d.autentica(123));

		Estoquista e = new Estoquista();
		e.setNome("João Paulo");
		e.setCpf("055.633.157.33");
		e.setMatricula("1515");
		e.setSalario(500);
		System.out.println("Nome: " + e.getNome() + "\nCPF: " + e.getCpf() + "\nMatrícula: " + e.getMatricula()
				+ "\nSalário bonificado do Estoquista R$ " + e.salarioBonificado() + "\nStatus: " + e.autentica(123));

	}

}
