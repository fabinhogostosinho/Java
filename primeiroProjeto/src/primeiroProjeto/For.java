package primeiroProjeto;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System. in);
		
		//Mostrando os números até 10
		for(int cont = 0; cont <= 10; cont++) {
		System.out.println(cont);

		}

		//Mostrando uma mensagem
		for(int texto = 1;texto <= 3; texto++) {
		System.out.println("Hoje é quinta");
		}
		
		System.out.println("-------------");
		//Mostrando uma mensagem
		System.out.println("Quantas vezes quer ver a mensagem?");
		int escolha = sc.nextInt();

		for(int texto = 1; texto <= escolha; texto++) {
		System.out.println("Hoje é quinta");
		}
		System.out.println("----------");
		
		/*Peça cinco salários para o usuário, se o salário for menor ou igual
		 * a 1500,mostre "você terá um aumento", senão, mostre "sem aumento"
		 */
		System.out.println("Qual seu salário?");
		double salario = sc.nextDouble();
		for(int voltas = 1; voltas <= 5; voltas++) {
			if(salario <= 1500) {
				System.out.println("Você terá um aumento");
				} else {
				System.out.println("sem aumento");
				}
			}
		/*O usuário irá informar um valor 5 vezes, some os valores digitados por
		* ele e mostre o resultado no final*/
		int soma = 0;
		for(int vez = 1; vez <= 5; vez++) {
		System.out.println("Informe um valor");
		int valor = sc.nextInt();
		soma = soma + valor; //soma += valor

		System.out.println("O resultado da soma é: " + soma);

		}
		
		
		
		
		
			

		

	}

}
