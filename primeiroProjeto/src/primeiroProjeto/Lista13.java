package primeiroProjeto;

import java.util.Scanner;

public class Lista13 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	// 1 - Contador:
	System.out.println("------------------");
    for (int i = 10; i <= 30; i++) {
        System.out.println(i);
    }

    System.out.println("------------------");

    // 2 - Classificação de Idades:
    for (int i = 1; i <= 10; i++) {
        System.out.println("Digite a idade " + i + ": ");
        int idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }

    System.out.println("-----------");

    // 3 - Eleição:
    for (int i = 1; i <= 5; i++) {
        System.out.println("Digite o voto " + i + ": ");
        int voto = sc.nextInt();
        if (voto == 1) {
            System.out.println("Candidato 1");
        } else if (voto == 2) {
            System.out.println("Candidato 2");
        } else if (voto == 3) {
            System.out.println("Candidato 3");
        } else if (voto == 4) {
            System.out.println("Candidato 4");
        } else if (voto == 5) {
            System.out.println("Voto nulo");
        } else if (voto == 6) {
            System.out.println("Voto em branco");
        } else {
            System.out.println("Código inválido");
        }
    }

    System.out.println("-----------");

    // 4 - Repetição de Frase:
    sc.nextLine();
    System.out.print("Digite uma frase: ");
    String frase = sc.nextLine();
    System.out.print("Digite um número: ");
    int vezes = sc.nextInt();
    for (int i = 1; i <= vezes; i++) {
        System.out.println(frase);
    }



    System.out.println("-----------");

    // 5 - Sequência:
    for (int i = 50; i >= 30; i--) {
        System.out.println(i);
    }

    System.out.println("-----------");

    // 6 - Números Alternados:
    for (int i = 1; i <= 50; i += 2) {
        System.out.println(i);
    }

    System.out.println("-----------");

    // 7 - Aprovado ou Reprovado:
    for (int i = 1; i <= 5; i++) {
        System.out.println("Digite a nota " + i + ": ");
        double nota = sc.nextDouble();
        if (nota >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    System.out.println("-----------");

    // 8 - Categoria de Idade:
    for (int i = 1; i <= 5; i++) {
        System.out.println("Digite a idade da pessoa " + i + ": ");
        int idade = sc.nextInt();
        if (idade <= 12) {
            System.out.println("Criança");
        } else if (idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }

    System.out.println("-----------");

    // 9 - Número Positivo ou Negativo:
    for (int i = 1; i <= 7; i++) {
        System.out.println("Digite o número " + i + ": ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Positivo");
        } else if (num < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }
    }


		       
		
	}

}
