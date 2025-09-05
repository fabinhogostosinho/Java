package primeiroProjeto;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
	
	
		int idade = 18;
				if(idade >= 18) {
					System.out.println("Você é maior de idade");
				}else {
					System.out.println("Você é menor de idade");
				}
				
				Scanner scanner = new Scanner(System.in);
				//Verificação de desconto
				System.out.println("Quanto você pagou? ");
				double valor = scanner.nextDouble();
				if(valor >= 200) {
					System.out.println("Você ganhou desconto");
				} else {
					System.out.println("Você não ganhou desconto");
				}
//--------------------------------------------------------------------//
				String continuar;
				System.out.println("Deseja continuarw ");
				continuar = scanner.nextLine();
				if(continuar == "sim") {
					System.out.println("Você escolheu continuar");
				} else {
					System.out.println("Você escolheu sair");
				}
//-------------------------------------------------------------------------//
				double nota1, nota2;
				  System.out.println("Informe a nota 1: ");
				nota1 = scanner. nextDouble();
				  System.out.println("Informe a nota 2: ");
				nota2 = scanner.nextDouble();
				double media = (nota1 + nota2) / 2;

				if(media < 7) {
				 System.out.println("Reprovado");
				} else {
				 System.out.println("Aprovado");
				}
/*Aplicação de desconto: Peça o valor da compra para o usuário se o valor for maior ou igual a 200, o usuário recebe um desconto de 15%, senão não tem desconto. Mostre se ele teve algum desconto e quanto deve pagar*/
				
				double valorCompra;
				double desconto = 0;
				System.out.println("Qual o valor da compra? ");
				valorCompra = scanner.nextDouble();

				if(valorCompra >= 200) {
				desconto = valorCompra * 0.15;
				}
				double precoFinal = valorCompra - desconto;
				System.out.println("Desconto: " + desconto);
				System.out.println("Valor Final: "+ desconto);
				
//----------------------------------------------------//
		/*Situação do estoque*/
/*Um mercado solicitou um sistema de verificação de estoque onde se o valor do estoque for maior ou igual a 100, mostre "Estoque ok", se for maior ou igual a 50, mostre "Atenção ao Estoque", senao, mostre "Estoque critico"*/
				int estoque;
				System.out.println("Quantos produtos tem no estoque?");
				estoque = scanner.nextInt();
				
				if(estoque >= 100) {
					System.out.println("Estoque OK");
					} else if (estoque >= 50) {
					System.out.println("Atenção ao Estoque");
					} else {
					System.out.println("Estoque critico");
					}

/*Crie um programa que verifica a classe eleitoral com base na idade. Se a idade for menor que 16, mostre "nao eleitor", se for menor que 18, mostre "voto opcional", se for menor de 65 mostre, "voto obrigatório", se for maior que 65, mostre "voto opcional", senão, mostre "idade inválida"!*/
			
				int idadeEleitoral;
				System.out.println("Qual sua idade? ");
				idadeEleitoral = scanner.nextInt();

				if(idadeEleitoral < 16) {
				System.out.println("Não Eleitor");
				} else if (idadeEleitoral < 18) {
				System.out.println("Voto Opcional");
				} else if (idadeEleitoral < 65) {
				System.out.println("Voto Obrigatorio");
				} else {
					System.out.println("Idade inválida");
				
	
					
					
					
					
					
					
					
					
			
				}	
	}

}
