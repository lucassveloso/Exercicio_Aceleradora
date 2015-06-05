package GuilhermeEduardo;

import java.util.Scanner;

import javax.xml.bind.ParseConversionEvent;

public class InversoInt {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		
		System.out.println("Informe um nº de 4 digitos: ");
		int num = e.nextInt();
		String nova="";
		String num2 = String.valueOf(num);
		
		for (int i = 3; i >= 0; i--) {
			nova+=num2.charAt(i);
		}
		
		System.out.println(nova);
		
		
	}
}
