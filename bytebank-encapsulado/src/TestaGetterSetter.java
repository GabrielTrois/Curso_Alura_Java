
public class TestaGetterSetter {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		conta.setTitular(paulo);
		
		conta.getTitular().setNome("Paulo");
		conta.getTitular().setCpf("222.222.222-22");
		conta.getTitular().setProfissao("Programador");
		
		conta.imprimeTitular();
	}
}
