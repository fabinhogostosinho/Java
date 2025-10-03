package funcaoParamentro;

import java.util.Scanner;

public class Lista18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 – Classificando valores
        System.out.println("Digite um número:");
        int numero = sc.nextInt();
        classificarValor(numero);

        // 2 – Maioridade
        System.out.println("Digite a sua idade:");
        int idade = sc.nextInt();
        verificarMaioridade(idade);

        // 3 – Boas Vindas
        sc.nextLine(); // limpar buffer
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        boasVindas(nome);

        // 4 – Tabuada
        System.out.println("Digite um número:");
        int tabuadaNum = sc.nextInt();
        tabuada(tabuadaNum);

        // 5 – Juntando palavras
        sc.nextLine(); // limpar buffer
        System.out.println("Digite a primeira palavra:");
        String p1 = sc.nextLine();
        System.out.println("Digite a segunda palavra:");
        String p2 = sc.nextLine();
        juntarPalavras(p1, p2);

        // 6 – Par ou Ímpar
        System.out.println("Digite um número:");
        int n = sc.nextInt();
        parOuImpar(n);

        // 7 – Classificando temperatura
        System.out.println("Digite a temperatura:");
        double temp = sc.nextDouble();
        classificarTemperatura(temp);

        // 8 – Saudação por turno
        System.out.println("Digite o turno (manhã, tarde, noite):");
        String turno = sc.nextLine();
        saudacaoTurno(turno);

        // 9 – Calculando média
        System.out.println("Digite a primeira nota:");
        double n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        double n2 = sc.nextDouble();
        System.out.println("Digite a terceira nota:");
        double n3 = sc.nextDouble();
        calcularMedia(n1, n2, n3);

        // 10 – Verificando aprovação
        System.out.println("Digite a nota final:");
        double nota = sc.nextDouble();
        verificarAprovacao(nota);
    }

    public static void classificarValor(int n) {
        if (n > 0) System.out.println("Positivo");
        else if (n < 0) System.out.println("Negativo");
        else System.out.println("Zero");
    }

    public static void verificarMaioridade(int idade) {
        if (idade >= 18) System.out.println("Maior de idade");
        else System.out.println("Menor de idade");
    }

    public static void boasVindas(String nome) {
        System.out.println("Olá " + nome);
    }

    public static void tabuada(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void juntarPalavras(String p1, String p2) {
        System.out.println(p1 + p2);
    }

    public static void parOuImpar(int n) {
        if (n % 2 == 0) System.out.println("Par");
        else System.out.println("Ímpar");
    }

    public static void classificarTemperatura(double temp) {
        if (temp < 15) System.out.println("Frio");
        else if (temp <= 25) System.out.println("Agradável");
        else System.out.println("Quente");
    }

    public static void saudacaoTurno(String turno) {
        if (turno.equalsIgnoreCase("manhã")) System.out.println("Bom dia!");
        else if (turno.equalsIgnoreCase("tarde")) System.out.println("Boa tarde!");
        else if (turno.equalsIgnoreCase("noite")) System.out.println("Boa noite!");
        else System.out.println("Turno inválido");
    }

    public static void calcularMedia(double n1, double n2, double n3) {
        System.out.println("Média: " + (n1 + n2 + n3) / 3);
    }

    public static void verificarAprovacao(double nota) {
        if (nota >= 7) System.out.println("Aprovado");
        else if (nota >= 5) System.out.println("Em recuperação");
        else System.out.println("Reprovado");
    }
}
