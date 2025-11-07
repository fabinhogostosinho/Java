package herança;

public class Filme extends Produto {
	
	private String diretor;

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	public void assistir() {
		
		System.out.println("Assistindo ao filme " + getNome() + " dirigido por " + getDiretor());
	}

}
