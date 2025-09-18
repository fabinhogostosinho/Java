package primeiroProjeto;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		
		int contador = 1;
		do {
		System.out.println(contador);
		contador++; //+1
		} while (contador <= 5);
		
		Scanner scanner = new Scanner(System.in); //java.util
		
		int idade;
		int voltas = 1;
		do {
		System.out.println("Qual sua idade?");
		idade = scanner.nextInt();
		 if (idade >= 18) {
		System.out.println("Maior de idade");
		} else {
		System.out.println("Menor de idade");
		}
		voltas++; //+1
		} while (voltas <= 3);
		
		System.out.println("--------------------------");
				int senha;
				do {
				System.out.println("Qual a senha? ");
				senha = scanner.nextInt();
				} while(senha != 1234);
				System.out.println("Acertou a senha!");
				
				System.out.println("----------------------");
				int dias = 1;
				int totalPassos = 0;
				do {
					System.out.println("Quantos passos voce caminhou hoje?");
					int passos = scanner.nextInt();
					totalPassos = totalPassos + passos;
					dias++; //+1
				} while(dias <= 3);
				System.out.println("Voce caminhou " + totalPassos);

		
		
		
		
		
		
		
		
		}

}
