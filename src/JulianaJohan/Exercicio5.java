package JulianaJohan;
import java.util.Random;


public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gerar = new Random();
		
		PrimoThread primo1 = new PrimoThread(gerar.nextInt(100));
	    Thread threadDoPrimo1= new Thread(primo1);
	    threadDoPrimo1.start();
	    
	    PrimoThread primo2 = new PrimoThread(gerar.nextInt(100));
	    Thread threadDoPrimo2= new Thread(primo2);
	    threadDoPrimo2.start();
	    
	    PrimoThread primo3 = new PrimoThread(gerar.nextInt(100));
	    Thread threadDoPrimo3= new Thread(primo3);
	    threadDoPrimo3.start();
	    
	    PrimoThread primo4 = new PrimoThread(gerar.nextInt(100));
	    Thread threadDoPrimo4= new Thread(primo4);
	    threadDoPrimo4.start();
	    
	    PrimoThread primo5 = new PrimoThread(gerar.nextInt(100));
	    Thread threadDoPrimo5= new Thread(primo5);
	    threadDoPrimo5.start();

	}

}
