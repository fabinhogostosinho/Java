package primeiroProjeto;

import java.util.Scanner;

public class ListadeExWhile2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1 - Contador:
		int contador = 1;
		while(contador <= 30) {
			System.out.println(contador);
			contador++; //1
		}
		System.out.println("------------------------");
		
		//2 - Soma de Números Digitados:
		int soma = 0;
		int valor;
		int contador1 = 1;
		System.out.println("Digite 3 números:");
		while(contador1 <= 3) {
			valor = scanner.nextInt();
			soma += valor;
			contador1 += 1;
			System.out.println("A soma dos números é:" + soma);
		}
		System.out.println("------------------------");
		//3 - Multiplicação de Números Digitados:
		int mult = 1;
		int valor1;
		int contador2 = 0;
		System.out.println("Digite 5 números:");
		while(contador2 <= 5) {
			valor1 = scanner.nextInt();
			mult *= valor1;
			contador2 += 1;
			System.out.println("A multiplicação dos números é:" + mult);
		}
		System.out.println("------------------------");
		//4 - Contar até o número informado:
		int valor2;
		System.out.println("Digite um número: ");
		valor2 = scanner.nextInt();
		int contador4 = 1;
		while(contador4 <= valor2) {
			System.out.println(contador4);
			contador4++; //1
		}
		System.out.println("------------------------");
		//5 - Somar os números de 1 a 5:
		int soma5 = 0;
		int contador5 = 1;

		while (contador5 <= 5) {
		    soma5 += contador5;
		    contador5 += 1;
		}
		System.out.println("A soma dos números de 1 a 5 é: " + soma);
		System.out.println("------------------------");
		
		//6 - Tabuada
		System.out.println("Digite um número para ver a tabuada:");
		int numero6 = scanner.nextInt();
		int contador6 = 1;
		while (contador6 <= 10) {
		    int resultado = numero6 * contador;
		    System.out.println(numero6 + " x " + contador6 + " = " + resultado);
		    contador6 += 1;
		}
		System.out.println("------------------------");

		
	}

}
