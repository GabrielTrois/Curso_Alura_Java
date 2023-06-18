
public class TestaVariaveis {
	
	public static void main(String[] args) {
		System.out.println("Informações Basicas");
		
		int idade = getIdade();
		String nome = getNome();
		
		System.out.println("Idade: " + idade);
		System.out.println("Nome: " + nome);
	}
	
	public static int getIdade() {
		return 19;
	}
	
	public static String getNome() {
		return "Gabriel";
	}
}
