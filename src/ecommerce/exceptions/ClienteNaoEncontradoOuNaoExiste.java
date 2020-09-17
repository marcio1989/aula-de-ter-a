package ecommerce.exceptions;

public class ClienteNaoEncontradoOuNaoExiste extends Exception {
	private static final long serialVersionUID = 1L;
		public ClienteNaoEncontradoOuNaoExiste(String msg) {
			super(msg);
		}
}
