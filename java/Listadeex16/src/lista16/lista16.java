package lista16;

import java.util.Scanner;

public class lista16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 - Criando um vetor de cores
        String[] cores = new String[6];
        for (int i = 0; i < cores.length; i++) {
            System.out.print("Digite a cor " + (i + 1) + ": ");
            cores[i] = sc.next();
        }
        System.out.println("Cores digitadas:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        // 2 - Vetor de números decimais
        double[] numerosDecimais = new double[8];
        for (int i = 0; i < numerosDecimais.length; i++) {
            System.out.print("Digite o número decimal " + (i + 1) + ": ");
            numerosDecimais[i] = sc.nextDouble();
        }
        System.out.println("Números decimais digitados:");
        for (double num : numerosDecimais) {
            System.out.println(num);
        }

        // 3 - Mostrando apenas os pares
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número inteiro " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Números pares digitados:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        // 4 - Menores que 50
        for (int i = 1; i <= 12; i++) {
            System.out.print("Digite o número " + i + ": ");
            int valor = sc.nextInt();
            if (valor < 50) {
                System.out.println("Menor que 50");
            }
        }

        // 5 - Procurando um nome no vetor
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = sc.next();
        }
        System.out.print("Digite um nome para procurar: ");
        String busca = sc.next();

        int cont = 0;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(busca)) {
                cont++;
            }
        }

        if (cont > 0) {
            System.out.println("Nome encontrado!");
        } else {
            System.out.println("Nome não encontrado!");
        }

        // 6 - Produto e preço
        String[] produtos = new String[4];
        double[] precos = new double[4];
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            produtos[i] = sc.next();
            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
        }
        System.out.println("Lista de produtos:");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("O produto " + produtos[i] + " custa R$" + precos[i]);
        }

        // 7 - Verificação de notas
        double[] notas = new double[6];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        System.out.println("Resultado das notas:");
        for (double nota : notas) {
            if (nota < 6) {
                System.out.println(nota + " - Aluno reprovado");
            } else if (nota < 7) {
                System.out.println(nota + " - Aluno em recuperação");
            } else {
                System.out.println(nota + " - Aluno aprovado");
            }
        }

        // 8 - Promoção de ingressos
        double[] ingressos = new double[5];
        for (int i = 0; i < ingressos.length; i++) {
            System.out.print("Digite o preço do ingresso " + (i + 1) + ": ");
            ingressos[i] = sc.nextDouble();
        }
        System.out.println("Verificação de promoção:");
        for (double preco : ingressos) {
            if (preco > 100) {
                System.out.println("Ingresso com promoção disponível! (R$" + preco + ")");
            }
        }

    }
}
