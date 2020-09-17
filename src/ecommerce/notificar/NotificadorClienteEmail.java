/**
 * 
 */
package ecommerce.notificar;

import ecommerce.model.Cliente;

/**
 * @author cbgomes
 *
 */
public class NotificadorClienteEmail implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		cliente.setAtivo();
		System.out.printf("Notificando o cliente %s através do e-mail %s com a mensagem %s",
				cliente.getNome(), cliente.getEmail(), mensagem );
		
	}

}
