
public class Administrador extends Funcionario implements Autenticavel {
	
	private AutenticadorUtil util;
	
	public Administrador() {
		this.util = new AutenticadorUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
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
