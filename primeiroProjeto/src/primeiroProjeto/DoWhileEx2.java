package primeiroProjeto;

import java.util.Scanner;

public class DoWhileEx2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 - Contador
        int contador = 1;
        do {
            System.out.println(contador);
            contador += 2;
        } while (contador <= 31);

        System.out.println("----------------------");

        // 2 - Adivinhação de número
        int numero;
        do {
            System.out.print("Digite um número (tente acertar 100): ");
            numero = sc.nextInt();
        } while (numero != 100);
        System.out.println("Você acertou, o número era 100!");

        System.out.println("----------------------");

        // 3 - Menu interativo
        int opcao;
        do {
            System.out.println("MENU:");
            System.out.println("1 - Continuar");
            System.out.println("2 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Você escolheu continuar!");
            } else if (opcao != 2) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 2);
        System.out.println("Programa encerrado.");

        System.out.println("----------------------");

        // 4 - Classificação de números
        int valor;
        int cont = 1;
        do {
            System.out.print("Digite um número: ");
            valor = sc.nextInt();

            if (valor < 10) {
                System.out.println("Tipo A");
            } else if (valor < 20) {
                System.out.println("Tipo B");
            } else {
                System.out.println("Fora da Categoria");
            }
            cont++;
        } while (cont <= 5);

        System.out.println("----------------------");

        // 5 - Temperatura do forno
        int temperatura;
        do {
            System.out.print("Digite a temperatura do forno: ");
            temperatura = sc.nextInt();

            if (temperatura >= 200) {
                System.out.println("ALERTA: Temperatura muito alta! Digite novamente.");
            }
        } while (temperatura >= 200);
        System.out.println("Temperatura dentro da faixa segura!");

        System.out.println("----------------------");

        // 6 - Verificação de bateria
        int bateria;
        do {
            System.out.print("Digite o nível da bateria (%): ");
            bateria = sc.nextInt();

            if (bateria <= 20) {
                System.out.println("Bateria baixa! Conecte o carregador.");
            }
        } while (bateria <= 20);
        System.out.println("Bateria em nível adequado!");

        System.out.println("----------------------");

        // 7 - Deseja fazer uma conta?
        String resposta;
        do {
            System.out.print("Deseja fazer uma conta? (sim/não): ");
            resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                System.out.print("Digite o primeiro número: ");
                int n1 = sc.nextInt();
                System.out.print("Digite o segundo número: ");
                int n2 = sc.nextInt();
                System.out.println("Resultado da soma: " + (n1 + n2));
            }
        } while (resposta.equalsIgnoreCase("sim"));

        System.out.println("Fim do programa!");
    }
}
