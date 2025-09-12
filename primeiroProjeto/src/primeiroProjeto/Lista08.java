package primeiroProjeto;

import java.util.Scanner;

public class Lista08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1 - Classificação de Dia da Semana
		
		System.out.println("Escolha um número de 1 a 7 (1 = Domingo, 2 = Segunda, etc.):");
		int dia = scanner.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("É fim de semana!");
			break;
		case 2:
			System.out.println("Dia útil");
			break;
		case 3:
			System.out.println("Dia útil");
			break;
		case 4:
			System.out.println("Dia útil");
			break;
		case 5:
			System.out.println("Dia útil");
		case 6:
			System.out.println("Dia útil");
			break;
		case 7:
			System.out.println("É fim de semana!");
			break;
			default:
				System.out.println("Dia inválido");
		
		}
		
		//2 - Menu de Bebidas
		System.out.println("Insira o código de bebida (1 = Café, 2 = Chá, 3 = Suco, 4 = Refrigerante):");
		int bebida = scanner.nextInt();
		
		switch(bebida) {
		case 1:
			System.out.println("Café = R$5,00");
			break;
		case 2:
			System.out.println("Chá = R$3,50");
			break;
		case 3:
			System.out.println("Suco = R$4,00");
			break;
		case 4:
			System.out.println("Refrigerante = R$4,50");
			break;
			default:
				System.out.println("Código inválido.");
		}
		
		// 3 - Tipo de Veículo
		System.out.println("Insira o código de veículo (1 = Carro, 2 = Moto, 3 = Caminhão):");
		int veiculo = scanner.nextInt();
		
		switch(veiculo) {
		case 1:
			System.out.println("Leve");
			break;
		case 2:
			System.out.println("Motocicleta");
			break;
			default:
				System.out.println("Veículo inválido");
		}
		
		//4 - Escolha de Plano de Assinatura
		
		System.out.println("Insira o código de plano (1 = Básico, 2 = Intermediário, 3 = Premium):");
		int plano = scanner.nextInt();
		
		switch(plano) {
		case 1:
			System.out.println("Leve");
			break;
		case 2:
			System.out.println("Motocicleta");
			break;
			default:
				System.out.println("Veículo inválido");
		}
		
		//5 - Seleção de Mês
		
		System.out.println("Insira um número de 1 a 12 representando um mês:");
		int mes = scanner.nextInt();
		
		switch(mes) {
		case 1:
			System.out.println("Verão");
			break;
		case 2:
			System.out.println("Verão");
			break;
		case 3:
			System.out.println("Outono");
			break;
		case 4:
			System.out.println("Outono");
			break;
		case 5:
			System.out.println("Outono");
			break;
		case 6:
			System.out.println("Inverno");
			break;
		case 7:
			System.out.println("Inverno");
			break;
		case 8:
			System.out.println("Inverno");
			break;
		case 9:
			System.out.println("Primavera");
			break;
		case 10:
			System.out.println("Primavera");
			break;
		case 11:
			System.out.println("Primavera");
			break;
		case 12:
			System.out.println("Verão");
			break;
			default:
				System.out.println("Mês inválido");
		}
		
		//6 - Tipo de Ingresso
		System.out.println("Insira um código de ingresso (1 = Inteira, 2 = Meia-entrada, 3 = VIP):");
		int ingresso = scanner.nextInt();
		
		switch(ingresso) {
		case 1:
			System.out.println("R$50,00");
			break;
		case 2:
			System.out.println("R$25,00");
			break;
		case 3:
			System.out.println("R$100,00");
			break;
			default:
				System.out.println("Ingresso inválido");
		}
		
		
		
		//7 - Escolha de Idioma
		System.out.println("Insira um código de idioma (1 = Português, 2 = Inglês, 3 = Espanhol):");
		int idioma = scanner.nextInt();
		
		switch(idioma) {
		case 1:
			System.out.println("Olá!");
			break;
		case 2:
			System.out.println("Hello!");
			break;
		case 3:
			System.out.println("Hola!");
			break;
			default:
				System.out.println("Idioma inválido");
		}
		
		//8 - Nível de Acesso
		System.out.println("Insira um código de nível (1 = Usuário, 2 = Moderador, 3 = Administrador):");
		int codigo1 = scanner.nextInt();
		
		switch(codigo1) {
		case 1:
			System.out.println("Acesso básico");
			break;
		case 2:
			System.out.println("Acesso básico + edição");
			break;
		case 3:
			System.out.println("Acesso total");
			break;
			default:
				System.out.println("Nível inválido");
		}
		
		//9 - Tipo de Pagamento
		System.out.println("Insira um código de pagamento (1 = Dinheiro, 2 = Cartão de Crédito, 3 = Pix):");
		int pagamento = scanner.nextInt();
		
		switch(pagamento) {
		case 1:
			System.out.println("Pagamento em dinheiro confirmado");
			break;
		case 2:
			System.out.println("Pagamento com cartão processado");
			break;
		case 3:
			System.out.println("Pagamento via Pix realizado");
			break;
			default:
				System.out.println("Método inválido");
		}
		
		
		
	
		

		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
