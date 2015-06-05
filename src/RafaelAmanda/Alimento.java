package RafaelAmanda;

public class Alimento implements Comparable<Alimento> {

	private String nome;
	private double acucar;
	
	public Alimento(String nome, double acucar){
		this.nome = nome;
		this.acucar = acucar;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getAcucar() {
		return acucar;
	}
	public void setAcucar(double acucar) {
		this.acucar = acucar;
	}

	@Override
	public int compareTo(Alimento o) {
		if(this.getAcucar()>o.getAcucar()){
			return 1;
		}else if(this.getAcucar()<o.getAcucar()){
			return -1;
		}else{
			return 0;
		}
	}
	
	
}
