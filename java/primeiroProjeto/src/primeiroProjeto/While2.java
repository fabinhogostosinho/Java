package primeiroProjeto;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int contador = 1;
		while(contador <= 5) {
			System.out.println("contador");
			contador++; //1
		}
		System.out.println("------------------------");
		int cont = 5;
		while(cont >= 1) {
			System.out.println(cont);
			cont--; //-1
		}
		System.out.println("------------------------");
		int c = 0;
		while(c <= 10 ) {
			System.out.println(c);
			c += 2; //+2 c= c + 2
		}
		System.out.println("-----------------------------------");
		//Soma os número informados pelo usuário
		int contador2 = 1;
		int soma = 0;
		
		while(contador2 <= 5) {
			System.out.println("Digite o número "+ contador2 +":");
			int numero = scanner.nextInt();
			soma = soma + numero;
			contador2++;
			System.out.println("A soma é: " + soma);
		}
		System.out.println("-----------------------------------");
		//Enquanto digitar para ficar o códico continua
		System.out.println();
		System.out.println("O que deseja? ");
		String texto = sc.next();
		while(texto.equalsIgnoreCase("ficar")) {
		System.out.println("O que deseja? ");
		texto = scanner.next();
		}
		System.out.println("Saiu");
		System.out.println("---------------------------------");
		
		//Quando o usuário digitar "sair" o código para
		System.out.println("o que deseja? ");
		String resposta = sc.next();
		while(!resposta. equalsIgnoreCase("sair" )) {
		System.out.println("O que deseja? ");
		resposta= scanner.next();
		}
		System.out.println("Voce saiu");
		
		
		
		
		
		
		
		
		
		
		
	}

}
