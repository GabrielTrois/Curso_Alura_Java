
public class TestaValores {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		Conta conta2 = new Conta(1337, 24226);
		
		System.out.println("Existem " + Conta.getTotal() + " conta(s)");
		
		conta.setAgencia(-180);
		conta.setNumero(-200);
		
		//System.out.println(conta.getAgencia());
		//System.out.println(conta.getNumero());
	}

}
