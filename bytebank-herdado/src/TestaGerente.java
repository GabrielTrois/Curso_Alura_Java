
public class TestaGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente();
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		
		if(g1.autenticar(2222)) {
			System.out.println("Autenticado");
		} else {
			System.out.println("Senha errada");
		}
		
		System.out.println(g1.getBonificacao());

	}

}
