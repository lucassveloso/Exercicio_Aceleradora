package JulianaJohan;
import javax.swing.text.StyledEditorKit.BoldAction;


public class Exercicio1 {
	
	public static void main(String[] args) {
		
		System.out.println("Esses são pares:");
		for (int i = 10; i < 200; i++) {
			if(i%2==0){
				System.out.println(i);
			}
		}
		int primo = 0;

		System.out.println("Esses são primos:");
		for (int i = 10; i < 200; i++) {
			primo=0;
			for (int j = 2; j < i; j++) {
				if(i%j==0){
					primo=1;
				}
			}
			
			if(primo==0){
				System.out.println(i);
			}
			
		}
	}
	

}
