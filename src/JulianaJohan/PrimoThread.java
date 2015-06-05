package JulianaJohan;
public class PrimoThread implements Runnable {
	int numero = 0;

	public PrimoThread(int numero) {
		this.numero = numero;
	}

	

	@Override
	public void run() {
		boolean primo = true;

	
			for (int j = 2; j < numero; j++) {
				if (numero % j == 0) {
					primo = false;
					break;
				}
			}

		
	
		if (primo) {
			System.out.println(numero + " É primo");
		}else {
			System.out.println(numero + " Não é primo");
		}

	}
}
