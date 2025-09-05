package primeiroProjeto;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero = 1;
		while(numero <= 5) {
			System.out.println(numero);
			numero++; // +1
		}
		int numero2  = 5;
		while(numero2 >= 1) {
			System.out.println(numero2);
			numero2--; //-1
		}
		int soma = 0;
		int valor;
		int contador = 1;
		System.out.println("Digite 3 números:");
		while(contador <= 3) {
			valor = scanner.nextInt();
			soma += valor;
			contador += 1;
			
			System.out.println("A soma dos números é:" + soma);
		}

	}

}
