package funcaoParamentro;

import java.util.Scanner;

public class funcaoParametro {
	public static void main(String[] args) {
		saudacao ("Marcia");
		saudacao ("Pedro");
		repetir ("Senai", 5);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual a sua idade?");
		int idade = sc.nextInt();
		
		classificacao(idade);

	}

	public static void saudacao (String nome) {
		System.out.println("Olá "+ nome);
	}
	
	public static void repetir (String texto, int vezes) {
		for(int i = 1; i <= vezes; i++) {
			System.out.println(texto);
		}
	}
	public static void classificacao(int idade) {
		if (idade <= 12) {
			System.out.println("Criança");
		}
		
	}
}
