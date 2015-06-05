package MarcusRaphael;

import java.util.Scanner;

public class Equacao {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		System.out.println("Informe b: ");
		double b = e.nextDouble();

		System.out.println("Informe x: ");
		double x = e.nextDouble();

		System.out.println("Informe k: ");
		double k = e.nextDouble();

		System.out.println("Informe y: ");
		double y = e.nextDouble();

		
		System.out.println("Informe a: ");
		double a = e.nextDouble();

		double resultado = (Math.pow(b, x) + k)
				/ (Math.sqrt(y + Math.pow(a, 2)));
		
		System.out.println("Resultado: " + resultado);

	}
}
