
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 16;
		int quantidadePessoas = 3;

		isMaiorDeIdade(idade, quantidadePessoas);
		
	}

	public static void isMaiorDeIdade(int idade, int quantidadePessoas) {
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você tem menos de 18 anos, "
						+ "mas pode entrar pois está acompanhado");
			}else {
			System.out.println("Você não pode entrar");
			}
		}
	}
}
