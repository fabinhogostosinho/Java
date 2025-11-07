package herança;

public class Cachorro extends Pet {
	
	private String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void dados() {
		System.out.println(getNome() + " é da raça: " + raca);
	}

}
