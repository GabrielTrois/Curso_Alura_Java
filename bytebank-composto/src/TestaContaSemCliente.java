
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		System.out.println(conta.getSaldo());
		
		conta.titular = new Cliente();
		
		conta.titular.nome = "Marcela";
		System.out.println(conta.titular.nome);
	}
}