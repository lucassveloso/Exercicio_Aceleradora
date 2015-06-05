package RafaelAmanda;

import java.util.ArrayList;
import java.util.Collections;

public class ListaCompra {

	public static void main(String[] args) {
		
		Alimento alimento1 = new Alimento("alimento1", 100);
		Alimento alimento2 = new Alimento("alimento2", 301);
		Alimento alimento3 = new Alimento("alimento3", 48);
		Alimento alimento4 = new Alimento("alimento4", 165);
		
		ArrayList<Alimento> array = new ArrayList<Alimento>();
		
		array.add(alimento1);
		array.add(alimento2);
		array.add(alimento3);
		array.add(alimento4);
		
		Collections.sort(array);
		Collections.reverse(array);
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println(i+"- Nome: "+ array.get(i).getNome()+ " - Açucar: "+ array.get(i).getAcucar());
		}
		
		
	}
}
