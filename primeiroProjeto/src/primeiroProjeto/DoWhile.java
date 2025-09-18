package primeiroProjeto;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        int contador = 11;

        do {
            System.out.println("Do ... While");
        } while (contador <= 10);

        while (contador <= 10) {
            System.out.println("While");
        }

        System.out.println("----------------------");

        int numero = 0;
        do {
            System.out.println(numero);
            numero += 5; // soma 5 a cada iteração
        } while (numero <= 20);

        System.out.println("---------------------");

        Scanner sc = new Scanner(System.in);

        int secreto = 5;
        int escolha = 0;
        do {
            System.out.print("Escolha um número: ");
            escolha = sc.nextInt();
            if (escolha > secreto) {
                System.out.println("É maior que o secreto.");
            } else if (escolha < secreto) {
                System.out.println("É menor que o secreto.");
            }
        } while (secreto != escolha);
        System.out.println("Acertou! :)");

        System.out.println("---------------------------");

        int opcao;
        do {
            System.out.println("Escolha uma opção do menu:");
            System.out.println("1 - Ficar na navegação");
            System.out.println("2 - Sair da navegação");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            if (opcao != 2) {
                System.out.println("Você ainda está na navegação.");
            }
        } while (opcao != 2);
        System.out.println("Saindo da navegação...");

        System.out.println("---------------------------");

        /* peça uma idade cinco vezes para o usuário, se a idade for menor ou igual
         * a 12, mostre "CRIANÇA", senão mostre "NÃO É CRIANÇA"
         */
        int idade;
        int cont = 1;
        do {
            System.out.print("Informe uma idade: ");
            idade = sc.nextInt();
            if (idade <= 12) {
                System.out.println("CRIANÇA");
            } else {
                System.out.println("NÃO É CRIANÇA");
            }
            cont++;
        } while (cont <= 5);
        System.out.println("FIM");

        /* Pergunte a nota para o usuario três vezes, se a nota for menos que cinco mostre "nota ruim" senão, mostre "nota boa'*/
        int nota;
        int cont2 = 1;
        do {
        	System.out.println("informe a nota");
        	nota = sc.nextInt();
        	if(nota < 5) {
        		System.out.println("nota ruim");
        	}else {
        		System.out.println("nota boa");
        	}
        	cont2++;
        }while (cont2 <= 3);
        System.out.println("Diario fechado");
        	}
        }

    
    }

}
