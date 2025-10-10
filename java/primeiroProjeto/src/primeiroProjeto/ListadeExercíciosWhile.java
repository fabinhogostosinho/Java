package primeiroProjeto;

import java.util.Scanner;

public class ListadeExercíciosWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1 - Contador
		int numero = 1;
		while(numero <= 10) {
			System.out.println(numero);
			numero++; // +1
		}
		
		//2 - Contagem regressiva
		int numero2  = 10;
		while(numero2 >= 1) {
			System.out.println(numero2);
			numero2--; //-1
		}
		
		//3 - Sequência numérica
		int numero3 = 0;
		int numero4;
		while(numero3 <= 100) {
			System.out.println(numero3);
			numero3 += 5;
			numero4 = numero3 + 5;
			
		}
		
		//4 - Mostrando mensagem
		int numero5 = 1;
		while(numero5 <= 5) {
			System.out.println("Eu gosto de Java");
			numero5++;
		}
		
		//5 - Soma de Números Digitados
		int soma = 0;
		int valor;
		int contador = 1;
		System.out.println("Digite 5 números:");
		while(contador <= 5) {
			valor = scanner.nextInt();
			soma += valor;
			contador += 1;
			
			System.out.println("A soma dos números é:" + soma);
		}
		
		//6 - Validação de Senha
		System.out.println("Digite a senha");
		int senha = scanner.nextInt();

		while (senha != 1234) {
		    System.out.println("Senha incorreta, tente novamente:");
		    senha = scanner.nextInt();
		}

		System.out.println("Acesso permitido!");
		
		//7 - Contagem Regressiva
		System.out.println("Digite um número para a contagem regressiva:");
		int contag = scanner.nextInt();
		while(contag >= 1) {
			System.out.println(contag);
			contag--;
		}

        


	}

}
