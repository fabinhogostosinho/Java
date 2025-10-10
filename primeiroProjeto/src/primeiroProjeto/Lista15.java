package primeiroProjeto;

import java.util.Scanner;

public class Lista15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 - Criando um vetor
        String[] frutas = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("fruta[" + i + "]: ");
            frutas[i] = sc.next();
        }
        System.out.println("------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(frutas[i]);
        }
        System.out.println("------------------------");

        // 2 - Vetor de números inteiros
        int[] poses = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("numero[" + i + "]: ");
            poses[i] = sc.nextInt();
        }
        System.out.println("-------------------------");
        System.out.println("Mostrando os valores armazenados:");
        for (int i = 0; i < 10; i++) {
            System.out.println(poses[i]);
        }
        System.out.println("-------------------------");

        // 3 - Mostrando os valores na ordem inversa
        poses = new int[7];
        System.out.println("Digite 7 números:");
        for (int i = 0; i < 7; i++) {
            System.out.print("n[" + i + "]: ");
            poses[i] = sc.nextInt();
        }
        System.out.println("Ordem inversa:");
        for (int i = 6; i >= 0; i--) {
            System.out.println(poses[i]);
        }
        System.out.println("-------------------------");

        // 4 - Maiores que 100
        poses = new int[10];
        System.out.println("Digite 10 números (verificando > 100):");
        for (int i = 0; i < 10; i++) {
            System.out.print("n[" + i + "]: ");
            poses[i] = sc.nextInt();
            if (poses[i] > 100) {
                System.out.println(poses[i] + " -> maior do que 100");
            }
        }
        System.out.println("-------------------------");

        // 5 - Procurando um valor no vetor
        poses = new int[8];
        System.out.println("Digite 8 números para o vetor de busca:");
        for (int i = 0; i < 8; i++) {
            System.out.print("n[" + i + "]: ");
            poses[i] = sc.nextInt();
        }
        System.out.print("Digite o número a ser procurado: ");
        int procurado = sc.nextInt();
        int achou = 0;
        for (int i = 0; i < 8; i++) {
            if (poses[i] == procurado) {
                achou = 1;
            }
        }
        if (achou == 1) {
            System.out.println(procurado + " existe no vetor.");
        } else {
            System.out.println(procurado + " não existe no vetor.");
        }
        System.out.println("-------------------------");

        // 6 - Nome e idade de 5 pessoas
        frutas = new String[5];
        poses = new int[5];
        System.out.println("Digite nome e idade de 5 pessoas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome[" + i + "]: ");
            frutas[i] = sc.next();
            System.out.print("Idade[" + i + "]: ");
            poses[i] = sc.nextInt();
        }
        System.out.println("Mostrando nomes e idades:");
        for (int i = 0; i < 5; i++) {
            System.out.println(frutas[i] + " tem " + poses[i] + " anos.");
        }
        System.out.println("-------------------------");

        // 7 - Identificação de idade
        poses = new int[10];
        System.out.println("Digite 10 idades:");
        for (int i = 0; i < 10; i++) {
            System.out.print("idade[" + i + "]: ");
            poses[i] = sc.nextInt();
            if (poses[i] < 18) {
                System.out.println("Você é menor de idade (idade: " + poses[i] + ").");
            }
        }
        System.out.println("-------------------------");

        // 8 - Aumento em massa
        poses = new int[7];
        System.out.println("Digite 7 salários (inteiros) para verificar aumento:");
        for (int i = 0; i < 7; i++) {
            System.out.print("salario[" + i + "]: ");
            poses[i] = sc.nextInt();
            if (poses[i] <= 2500) {
                System.out.println("Você receberá um aumento.");
            }
        }
        System.out.println("-------------------------");

    }

}
