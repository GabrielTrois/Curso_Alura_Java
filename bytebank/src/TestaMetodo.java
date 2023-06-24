
public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.saldo = 100;
		conta.deposita(50);
		
		System.out.println(conta.saldo);
		
		if(conta.saca(20)) {
			System.out.println("Valor retirado");
			System.out.println("Saldo conta = " + conta.saldo);
		}else {
			System.out.println("Saldo insuficiente");
		}
		
		Conta conta2 = new Conta();
		
		if(conta.transfere(120, conta2)) {
			System.out.println("Valor transferido");
			System.out.println("Saldo conta = " + conta.saldo);
			System.out.println("Saldo conta2 = " + conta2.saldo);
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
}
