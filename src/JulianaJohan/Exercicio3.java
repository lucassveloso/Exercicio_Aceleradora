package JulianaJohan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Exercicio3 {
public static void main(String[] args) {
	ArrayList<Integer> lista1 = new ArrayList<Integer>();
	ArrayList<Integer> lista2 = new ArrayList<Integer>();
	Random gerador = new Random();
	
	for (int i = 0; i < 100; i++) {
		lista1.add(gerador.nextInt(200));
		lista2.add(gerador.nextInt(200));
	}
	
	System.out.println("Maior da lista 1: "+ Collections.max(lista1));
	System.out.println("Maior da lista 2: "+ Collections.max(lista2));
}
	
	
	
}
