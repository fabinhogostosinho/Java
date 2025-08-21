package lista05;

import java.util.Scanner;

public class Lista05 {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        // 1 - Classificação de idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade < 12) {
            System.out.println("Criança");
        } else if (idade < 17) {
            System.out.println("Adolescente");
        } else if (idade < 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
        System.out.println();

        // 2 - Avaliação de Temperatura
        System.out.print("Digite a temperatura em °C: ");
        double temp = scanner.nextDouble();
        if (temp < 10) {
            System.out.println("Muito Frio");
        } else if (temp < 20) {
            System.out.println("Frio");
        } else if (temp < 30) {
            System.out.println("Agradável");
        } else {
            System.out.println("Muito Quente");
        }
        System.out.println();

        // 3 - Sistema de Notas Escolares
        System.out.print("Digite a nota: ");
        double nota = scanner.nextDouble();
        if (nota >= 90) {
            System.out.println("A");
        } else if (nota >= 80) {
            System.out.println("B");
        } else if (nota >= 70) {
            System.out.println("C");
        } else if (nota >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        System.out.println();

        // 4 - Verificação de senha
        System.out.print("Digite a senha: ");
        String senha = scanner.next(); 
        if (senha.equals("admin")) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
        System.out.println();

        // 5 - Comparação de nomes
        System.out.print("Digite o primeiro nome: ");
        String nome1 = scanner.next();
        System.out.print("Digite o segundo nome: ");
        String nome2 = scanner.next();
        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("Os nomes são iguais.");
        } else {
            System.out.println("Os nomes são diferentes.");
        }
        System.out.println();

        // 6 - Jogo da cor favorita
        System.out.print("Digite sua cor favorita: ");
        String cor = scanner.next();
        if (cor.equalsIgnoreCase("azul")) {
            System.out.println("Boa escolha!");
        } else if (cor.equalsIgnoreCase("vermelho")) {
            System.out.println("Cor vibrante!");
        } else if (cor.equalsIgnoreCase("verde")) {
            System.out.println("Cor da natureza!");
        } else {
            System.out.println("Cor não cadastrada.");
        }
        System.out.println();

        // 7 - Verificação de vogal
        System.out.print("Digite uma letra: ");
        String letra = scanner.next();
        String vogais = "a" + "e" + "i" + "o" + "u";
        if (vogais.contains(letra.toLowerCase())) {
            System.out.println("É uma vogal.");
        } else {
            System.out.println("Não é vogal.");
        }


      
    }
}
