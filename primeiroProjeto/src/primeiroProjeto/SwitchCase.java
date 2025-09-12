package primeiroProjeto;

import java.util.Scanner;


public class SwitchCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int opcao = 2;
//		switch(opcao) {
//		case 1:
//			System.out.println("O número é 1");
//			break;
//		case 2:
//			System.out.println("O número é 2");
//			break;
//		default:
//			System.out.println("Número incorreto");
//		}
//		
//		//cantina
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("1- Suco");
//	System.out.println("2- Lanche");
//	System.out.println("3- Chocolate");
//	int escolha = scanner.nextInt();
//	switch (escolha) {
//	
//	case 1:
//		System.out.println("Pague R$4.00");
//		break;
//	case 2:
//		System.out.println("Pague R$7.00");
//		break;
//	case 3:
//		System.out.println("Pague R$5.00");
//		break;
//		default:
//			System.out.println("Opção Incorreta");
//	}
//	
//	/*Peça um valor para o usuário, se for igual 1 ou 2, mostre "muito bom"
//	* se for igual 3 ou 4 mostre "bom", senao, mostre "ruim" */
//	int valor = 2;
//	switch(valor) {
//	
//	case 1:
//	case 2:
//		System.out.println("Muito bom");
//		break;
//	case 3:
//	case 4:
//		System.out.println("bom");
//		break;
//		default:
//	System.out.println("ruim");
//	}

		System.out.println("Digite um número e veja uma cor: ");
		int numero = scanner.nextInt();
		
		switch(numero) {
		case 1:
			System.out.println("Vermelho");
			break;
		case 2:
			System.out.println("Azul");
			break;
			default:
				System.out.println("Número Incorreto");
		
		}
		
		System.out.println("qual categoria você pertence?");
		String categoria = scanner.next();
		switch (categoria) {
		case "A":
			System.out.println("Infantil");
			break;
		case "B":
			System.out.println("Juvenil");
			break;
		default: 
			System.out.println("Categoria incorreta");
		
		}
		
		System.out.println("Escolha a operação matemática de dois números");
		String operacao = scanner.next();
		
		switch (operacao) {
		case "+":
			int adicao = 5 + 5;
			break;
		case "-":
			int subtracao = 5 - 5;
			break;
		case "*":
			int multi = 5 * 5;
			break;
		case "/":
			int divisao = 5 / 5;
			break;
			default:
				System.out.println("Operação incorreta");
			
		}
		
		
	
		
		
		
		
		
		
	}

}
