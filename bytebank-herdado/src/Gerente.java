
public class Gerente extends Funcionario {
	
	private int senha;
	
	public boolean autenticar(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao() {
		System.out.println("Bonificacao GERENTE");
		return super.getBonificacao() + super.getSalario();
	}
}
