package herança;

public class Cachorro extends Animal {
	private String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void abanarRabo() {
		System.out.println("o cachorro da raça " + raca +" está abanando o rabo");
	}
}
