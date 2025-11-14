package polimorfismo;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		
		Conta corrente = new ContaCorrente("0001","Fábio Henrique", 0);
		corrente.depositar(100);
		corrente.sacar(90);
		corrente.exibirInfos();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o número da conta?");
		String conta = sc.next();
		System.out.println("Qual o nome do titular?");
		String titular = sc.next();
		System.out.println("Qual o saldo inicial?");
		double saldo = sc.nextDouble();
		
		Conta poupanca = new ContaPoupanca(conta, titular, saldo);
		System.out.println("Quanto você quer depositar?");
		double valor = sc.nextDouble();
		poupanca.depositar(valor);
		poupanca.sacar(10);

	}

}
