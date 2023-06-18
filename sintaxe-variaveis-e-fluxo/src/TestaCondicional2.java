
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 18;
		int quantidadePessoas = 3;
		
		//boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado = false;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		}

		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente voce nao pode entrar");
		}
	}
}