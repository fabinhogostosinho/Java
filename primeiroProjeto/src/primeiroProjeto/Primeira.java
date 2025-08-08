package primeiroProjeto;

import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {
		System.out.println("Olá Mundo! :P");
	
		//Declaração de variável
		int idade = 24;
		double salario = 2000.50;
		char letra = 'J';
		String nome = "Juliana";
		boolean chuva = false;
		
		System.out.println(idade);
		System.out.println("O salário é: "+ salario + "reais");
		System.out.println("Letra: " +letra);
		System.out.println("O nome é: " + nome);
		System.out.println(chuva);
		
		//Operadores
		int num1 = 10;
		int num2 = 3;
		double soma = num1 + num2;
		double sub = num1 - num1;
		double div = num1 / num2;
		double mult = num1 * num2;
		double resto = num1 % num2; //Modulo - Resto da divisão
		
		System.out.println("Soma: "+ soma);
		System.out.println("Subtração: " + sub);
		System.out.println("Multiplicação: "+mult);
		System.out.println("Divisão: "+div);
		System.out.println("Resto: "+resto);
		
		//Entrada de Dados
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual o seu nome? ");
		String nome1 = scanner.nextLine();
		System.out.println("Olá "+ nome1);
		
		//Soma de dois números
		int numero1;
		int numero2;
		System.out.println("Informe um número: ");
		numero1 = scanner.nextInt();
		System.out.println("Informe outro número: ");
		numero2 = scanner.nextInt();
		int soma1 = numero1 + numero2;
		System.out.println("O resultado é: "+soma1);
		
		/*Peça o ano de nascimento do usuário e mostre quantos anos ele tem*/
		int ano= 2025;
		int nascimento;
		System.out.println("Qual o seu ano de nascimento? ");
		nascimento = scanner.nextInt();
		int total = ano - nascimento;
		System.out.println("Você tem "+ total + " anos");
		
		//Calcular desconto
		double preco;
		double desconto;
		System.out.println("Qual o valor da compra?: ");
		preco = scanner.nextDouble();
		System.out.println("Qual o valor do desconto?: ");
		desconto = scanner.nextDouble();
		double pagar = preco - desconto;
		System.out.println("Pague: "+ pagar);
		
		/*Peça suas notas decimais para o usuário, calcule a média e mostre*/
		double nota1;
		double nota2;
		System.out.println("Digite uma nota");
		nota1 = scanner.nextDouble();
		System.out.println("Digite a outra nota: ");
		nota2 = scanner.nextDouble();
		double media = (nota1 + nota2) / 2;
		System.out.println("Sua média é: "+media);
		
		
		

		
		
	}

}
