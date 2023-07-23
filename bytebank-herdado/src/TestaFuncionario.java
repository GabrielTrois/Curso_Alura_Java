
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Gerente gabriel = new Gerente();
		gabriel.setNome("Gabriel Augusto");
		gabriel.setCpf("222.222.222-22");
		gabriel.setSalario(2600.00);
		
		System.out.println(gabriel.getNome());
		System.out.println(gabriel.getBonificacao());

	}

}
