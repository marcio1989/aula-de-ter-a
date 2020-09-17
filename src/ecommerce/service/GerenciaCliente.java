package ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import ecommerce.model.Cliente;

public class GerenciaCliente implements GerenciadorCliente {
	
	private  List<Cliente> clientes;
	
	 public GerenciaCliente() {
		this.clientes = new ArrayList<Cliente>();
	}
	@Override
	public void salvar(Cliente cliente) {
		this.clientes.add(cliente);
	}
	@Override
	public void remover(String cpf) {
		//this.clientes //fazer alguma coisa, que recupere a informação do cpf e remova o cliente dessa lista
	}
	@Override
	public List<Cliente> listar(){
		return clientes;
	}
	@Override
	public void ativaCliente(Cliente cliente) {
		cliente.setAtivo();
	}
	@Override
	public Cliente buscaPorCpf(String cpf) { //throws ClienteNaoEncontradoOuNaoExiste {
		List<Cliente> resultado = this.clientes.stream().filter(c -> 
		cpf.equals(c.getCpf())).collect(Collectors.toList());
		return resultado.get(0);
	}
}
