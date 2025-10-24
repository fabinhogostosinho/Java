package Poo;

public class Funcionario {
	String nome;
	double salario;
	
	void novoSalario(double aumento) {
		double salario2 = salario + aumento;
		System.out.println("O novo salário é" + nome + "é R$" + salario2);
	}

}
