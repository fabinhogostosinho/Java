package primeiroProjeto;

import java.util.Scanner;


public class OperadoresLogicos2 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Qual sua idade?");
		int idade = scanner.nextInt();
		System.out.println("Tem título de eleitor?");
		String resposta = scanner.next();
		
		if(idade >= 16 && resposta.equalsIgnoreCase("SIM")) {
			System.out.println("Pode votar");
		} else {
			System.out.println("Não pode votar");
		}
		
		int numero;
		System.out.println("Informe um número: ");
		numero = scanner.nextInt();
		
		if(numero >= 10 || numero <= 20) {
			System.out.println("O número está entre 10 e 20");
		} else {
			System.out.println("O número está fora no intervalo");
		}
		
		//compra maior que 200
		System.out.println("Qual o valor da compra?");
		double valor = scanner.nextDouble();
		System.out.println("É cliente VIP? ");
		boolean vip = scanner.nextBoolean();
		
		if(valor > 200 && vip == true) {
			double desconto = valor * 0.15;
			double valorFinal = valor - desconto;
			System.out.printf("Vai pagar: %.2f", valorFinal);
		} else {
			System.out.println("Não tem desconto");
		}
		/*Para participar de um workshop precisa ter idade entre 20 e 40 anos
		 * e possuir experiência. Se as informações forem verdadeiras exiba "Inscrição aceita", senão "Inscrição rejeitada". */
		
		int iddwork;
		System.out.println("Informe a idade: ");
		iddwork = scanner.nextInt();
		String exp;
		System.out.println("Tem experiência?");
		exp = scanner.next();
		if ((iddwork > 20 && iddwork < 40) && exp.equalsIgnoreCase("sim"))  {
			System.out.println("Inscrição aceita");
		} else {
			System.out.println("Inscrição rejeitada");
		}
		

	}

}
