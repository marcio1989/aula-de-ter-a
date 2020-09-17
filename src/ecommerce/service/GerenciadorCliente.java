package ecommerce.service;

import java.util.List;

import ecommerce.exceptions.ClienteNaoEncontradoOuNaoExiste;
import ecommerce.model.Cliente;

public interface GerenciadorCliente {
	
	public void salvar(Cliente cliente);
		//this.clientes.add(cliente);

	public void remover(String cpf);
		//this.clientes
	
	public List<Cliente> listar();
		//return clientes;

	
	public void ativaCliente(Cliente cliente);
		//cliente.setAtivo();
	
	public Cliente buscaPorCpf(String cpf) throws ClienteNaoEncontradoOuNaoExiste;

	
}
