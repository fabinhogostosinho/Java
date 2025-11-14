package polimorfismo;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		
		
		Funcionario f1 = new Gerente();
		Funcionario f2 = new Estagiario();
		Scanner sc = new Scanner(System.in);
		
		double salario;
		String nome;
		
		
		System.out.println("Qual o nome do Gerente?");
		nome = sc.next();
		System.out.println("Qual o salário base da empresa?");
		salario = sc.nextDouble();
		
		f1.setNome(nome);
		f1.setSalario(salario);
		
		System.out.println("Qual o nome do estagiário?");
		nome = sc.next();
		
		f2.setNome(nome);
		f2.setSalario(salario);
		
		System.out.println("Gerente");
		f1.exibirDados();
		System.out.println("-------------------------------");
		System.out.println("Estagiário");
		f2.exibirDados();
	}
		

}
