package herança;

public class Gato extends Animal {
	private String cor;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void subirNoMuro() {
		System.out.println("o gato " + cor + " está em cima do muro");
	}
}
