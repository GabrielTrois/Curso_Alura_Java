
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticadorUtil util;
	
	public Gerente() {
		this.util = new AutenticadorUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Bonificacao GERENTE");
		return super.getSalario();
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
