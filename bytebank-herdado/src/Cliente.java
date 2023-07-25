
public class Cliente implements Autenticavel {

	private AutenticadorUtil util;
	
	public Cliente() {
		this.util = new AutenticadorUtil();
	}
	
	@Override
	public boolean autenticar(int senha) {
		return this.util.autenticar(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
	}
}
