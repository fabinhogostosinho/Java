package herança;

public class Professor extends Pessoa {
	
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void ensinar() {
		System.out.println(getNome() + " está dando aula.");
	}
}
