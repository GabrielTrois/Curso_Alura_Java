
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Bonificacao EDITOR DE VIDEO");
		return super.getBonificacao() + 100;
	}
}
