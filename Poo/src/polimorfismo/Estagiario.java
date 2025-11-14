package polimorfismo;

public class Estagiario extends Funcionario {
	
	@Override 
	public void exibirDados(){
		System.out.println("Nome: " + getNome());
		System.out.println("Salário: " + (getSalario() + 100));
	}

}
