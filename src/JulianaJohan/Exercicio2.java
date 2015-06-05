package JulianaJohan;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		System.out.println("Escreva a frase: ");
		String frase = e.nextLine();
		int cont = 0;
		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i'
					|| c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U'

			) {
				cont++;
			}
		}
		
		System.out.println("Nº de vogais: " + cont);

	}

}
