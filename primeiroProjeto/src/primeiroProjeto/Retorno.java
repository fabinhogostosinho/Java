package primeiroProjeto;

import java.util.Scanner;

public class Retorno {

	public static void main(String[] args) {
		System.out.println(saudacao("Fábio"));
		int resultado = numeroFavorito();
		System.out.println(resultado);
		int dobro = dobro(7);
		System.out.println("O dobro é: "+dobro);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual seu salário?");
		double salario = sc.nextDouble();
		System.out.println("Qual seu aumento?");
		double aumento = sc.nextDouble();
		
		double novoSalario = aumento(salario, aumento);
		System.out.println("Novo salário: R$"+novoSalario);
		/*exemplo q ela passou*/
		System.out.println("Qual a sua nota?");
		int nota = sc.nextInt();
		
		int media = retorno(nota);
		System.out.println("Você foi ");

	}
	public static String saudacao(String nome) {
		return "Olá " + nome;
	}
	public static int numeroFavorito() {
		return 5;
	}
	public static int dobro(int numero) {
		return numero * 2;
	}
	public static double aumento(double salario, double aumento) {
		double novoSalario = salario + aumento;
		return novoSalario;
	}
	public static 
}
