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
		System.out.println("Digite sair para sair");
		String resposta = scanner.next();
		
		while(!resposta.equalsIgnoreCase("sair")) {
			System.out.println("Tente novamente");
			resposta = scanner.next();
		}
		System.out.println("Você conseguiu sair");
		
		/**Peça um valor para o usuário
		 *  e mostre os números do 1 até chegar no
numero que ele digitou*/
        System.out.println("Digite um valor");
        int valor2 = scanner.nextInt();
        int aux = 1;
        while(aux <= valor2) {
        	System.out.println(aux);
        	aux++;
        }
        
        /*Peça  um número para usuário e continue pedindo enquanto o número
         * for diferente de 7
         */
        System.out.println("Digite um número");
        int sete = scanner.nextInt();
        while (sete != 7) {
        	System.out.println("Tente outro número");
        	
        }

        
        
	}

}
