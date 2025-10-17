package Lista20;

import java.util.Scanner;

public class Lista20 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		saudacao();
		saudacao();
		saudacao();
		saudacao();
		saudacao();
		retangulo();
		multiplos();
		contagem();
		System.out.println("Pronto!");
		System.out.println();
		meses();
		divisivel();
		despedida();
		unirNomes();
		maiorQue100();
		classificarVelocidade();
		saudacaoDia();
		verificarEstoque();
	}
	
	//1 – Repetindo uma saudação
	public static void saudacao() {
		System.out.println("Bom dia!");
	}
	
	//2 – Desenhando um retângulo
	public static void retangulo() {
		System.out.println();
		int linhas = 3;
		int colunas = 5;
		
		for(int l=0; l<linhas; l++) {
			for(int c=0; c<colunas; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//3 – Imprimindo múltiplos de 5
	public static void multiplos() {
		for(int i=5; i<=25; i+=5) {
			System.out.println(i);
		}
		System.out.println();
	}
	
	//4 – Exibindo uma contagem crescente
	public static void contagem() {
		for(int i=1; i<=8; i++) {
			System.out.println(i);
		}
	}
	
	//5 – Mostrando os meses do ano
	public static void meses() {
		System.out.println("Janeiro");
		System.out.println("Fevereiro");
		System.out.println("Março");
		System.out.println("Abril");
		System.out.println("Maio");
		System.out.println("Junho");
	}
	
	//1 – Verificando divisibilidade
	public static void divisivel() {
		System.out.println();
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		if(num % 5 == 0) {
			System.out.println("É divisível por 5");
		} else {
			System.out.println("Não é divisível por 5");
		}
	}
	
	//2 – Mensagem de despedida
	public static void despedida() {
		System.out.println();
		System.out.print("Digite seu nome: ");
		String nome = sc.next();
		System.out.println("Até logo, " + nome + "!");
	}
	
	//3 – Unindo nomes
	public static void unirNomes() {
		System.out.println();
		System.out.print("Digite o nome: ");
		String nome = sc.next();
		System.out.print("Digite o sobrenome: ");
		String sobrenome = sc.next();
		System.out.println(nome + " " + sobrenome);
	}
	
	//4 – Verificando maior que 100
	public static void maiorQue100() {
		System.out.println();
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		if(num > 100) {
			System.out.println("Maior que 100");
		} else {
			System.out.println("Não é maior que 100");
		}
	}
	
	//5 – Classificando velocidade
	public static void classificarVelocidade() {
		System.out.println();
		System.out.print("Digite a velocidade: ");
		int v = sc.nextInt();
		if(v < 40) {
			System.out.println("Lenta");
		} else if(v <= 80) {
			System.out.println("Normal");
		} else {
			System.out.println("Rápida");
		}
	}
	
	//6 – Saudação por dia da semana
	public static void saudacaoDia() {
		System.out.println();
		System.out.print("Digite o dia da semana: ");
		String dia = sc.next();
		System.out.println("Tenha uma ótima " + dia + "!");
	}
	
	//7 – Verificando situação de estoque
	public static void verificarEstoque() {
		System.out.println();
		System.out.print("Digite a quantidade em estoque: ");
		int qtd = sc.nextInt();
		if(qtd >= 10) {
			System.out.println("Estoque suficiente");
		} else if(qtd >= 5) {
			System.out.println("Estoque baixo");
		} else {
			System.out.println("Estoque crítico");
		}
	}
}
