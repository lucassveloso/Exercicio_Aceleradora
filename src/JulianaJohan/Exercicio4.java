package JulianaJohan;
import java.util.ArrayList;
import java.util.Collections;


public class Exercicio4 {
	
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			lista.add(i);
		}
		
		inverter(lista);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
	
	public static ArrayList<Integer> inverter(ArrayList<Integer> lista){
		Collections.reverse(lista);
		return lista;
	}

}
