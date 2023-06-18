import java.util.Iterator;

public class TestaCaracteres {

	public static void main(String[] args) {
		
		char letra = '1';
		System.out.print(letra);
		
		char i = 50;
		while(i < 91) {
			System.out.print(i);
			i = (char) (i + 1);
		}
		
		System.out.println("");
		
		String palavra = "Hoje é dia ";
		System.out.println(palavra);
		
		palavra = palavra + 18;
		System.out.println(palavra);
	}

}
