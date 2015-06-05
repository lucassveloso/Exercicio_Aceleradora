package YasserThiago;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		int nota10 = 0;
		int nota20 = 0;
		int nota50 = 0;
		int nota100 = 0;
		

		Scanner e = new Scanner(System.in);

		System.out.println("Informe o valor a ser sacado: ");
		int valor = e.nextInt();

		if (valor / 100 > 0) {
			nota100 = valor / 100;
			valor -= nota100*100;
		}
		if (valor / 50 > 0) {
			nota50 = valor / 50;
			valor -= nota50*50;
		}
		if (valor / 20 > 0) {
			nota20 = valor / 20;
			valor -= nota20*20;
		}
		if (valor / 10 > 0) {
			nota10 = valor / 10;
			valor -= nota10*10;
		}
		
		
		System.out.println(nota10 + " - 10 |" + nota20 + " - 20 |" +nota50 + " - 50 |" +nota100 + " - 100 "  );

	}
}
