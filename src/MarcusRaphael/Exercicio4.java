package MarcusRaphael;

import java.util.Scanner;

public class Exercicio4 {

	public static boolean isPrimo(int numero){
		boolean primo=true;
	for (int j = 2; j < numero; j++) {
		if (numero % j == 0) {
			primo = false;
			break;
		}
	}
	return primo;
	}
	
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int num = e.nextInt();
		
		if(isPrimo(num)){
			System.out.println("Esse numero é primo");
		}else{
			System.out.println("Esse numero não é primo");
		}
		
	}
	
}
