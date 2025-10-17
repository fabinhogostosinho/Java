package ex;

import java.util.Scanner;

public class Lista17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 – Criando matriz 2x3
        int[][] m1 = new int[2][3];
        System.out.println("Digite os elementos da matriz 2x3:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                m1[i][j] = sc.nextInt();
        System.out.println("Matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(m1[i][j] + " ");
            System.out.println();
        }

        // 2 – Nomes em uma tabela 3x2
        String[][] nomes = new String[3][2];
        System.out.println("Digite os nomes para a tabela 3x2:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 2; j++)
                nomes[i][j] = sc.next();
        System.out.println("Tabela de nomes 3x2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(nomes[i][j] + " ");
            System.out.println();
        }

        // 3 – Mostrando a diagonal principal 3x3
        int[][] m3 = new int[3][3];
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                m3[i][j] = sc.nextInt();
        System.out.println("Diagonal principal:");
        for (int i = 0; i < 3; i++)
            System.out.print(m3[i][i] + " ");
        System.out.println();

        // 4 – Procurando um número em 3x3
        int[][] m4 = new int[3][3];
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                m4[i][j] = sc.nextInt();
        System.out.println("Digite o número a ser procurado:");
        int num = sc.nextInt();
        boolean achou = false;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (m4[i][j] == num) {
                    System.out.println("Número encontrado em: " + i + " " + j);
                    achou = true;
                }
        if (!achou)
            System.out.println("Não encontrado");

        // 5 – Elementos maiores que 10 em 4x3
        int[][] m5 = new int[4][3];
        System.out.println("Digite os elementos da matriz 4x3:");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 3; j++)
                m5[i][j] = sc.nextInt();
        System.out.println("Elementos maiores que 10:");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 3; j++)
                if (m5[i][j] > 10)
                    System.out.println(m5[i][j]);

        sc.close();
    }
}
