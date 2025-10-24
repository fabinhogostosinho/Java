package Poo;

import java.util.Scanner;

public class FuncionarioP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		func.nome = "José";
		func.salario = 2000;
		func.novoSalario(500);
		System.out.println("-------------------------------------");
		System.out.println("Qual seu nome?");
		func.nome = sc.next();
		System.out.println("Qual seu salário?");
		func.salario = sc.nextDouble();
		System.out.println("Qual o aumento?");
		double aumento = sc.nextDouble();
		
		func.novoSalario(aumento);
	}

}
