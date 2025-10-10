package primeiroProjeto;

import java.util.Scanner;

public class Lista14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 - Contador de 1 a 10
        System.out.println("------------------------");
        for (int cont = 1; cont <= 10; cont++) {
            System.out.println(cont);
        }
        System.out.println("------------------------");

        // 2 - Somando números de 1 a 100
        int soma = 0;
        for (int valor = 1; valor <= 100; valor++) {
            soma += valor;
            System.out.println("Soma de 1 a 100: " + soma);
        }
        
        System.out.println("------------------------");

        // 3 - Números pares de 1 a 20
        System.out.println("Números pares de 1 a 20:");
        for (int valor1 = 1; valor1 <= 20; valor1++) {
            if (valor1 % 2 == 0) {
                System.out.println(valor1);
            }
        }
        System.out.println("------------------------");

        // 4 - Tabuada de um número
        System.out.print("Digite um número para ver a tabuada: ");
        int num = sc.nextInt();
        for (int valor2 = 1; valor2 <= 10; valor2++) {
            System.out.println(num + " x " + valor2 + " = " + (num * valor2));
        }
        System.out.println("------------------------");

        // 5 - Contar números divisíveis por 3 de 1 a 50
        int contador = 0;
        for (int valor3 = 1; valor3 <= 50; valor3++) {
            if (valor3 % 3 == 0) {
                contador++;
            }
        }
        System.out.println("Quantidade de números divisíveis por 3: " + contador);
        System.out.println("------------------------");

        // 6 - Números ímpares de 1 a N
        System.out.print("Digite um número N: ");
        int numero = sc.nextInt();
        for (int valor4 = 1; valor4 <= numero; valor4++) {
            if (valor4 % 2 != 0) {
                System.out.println(valor4);
            }
        }
        System.out.println("------------------------");

        // 7 - Multiplicação de 5 valores
        int mult = 1;
        for (int valor5 = 1; valor5 <= 5; valor5++) {
            System.out.print("Digite o valor " + valor5 + ": ");
            int valor = sc.nextInt();
            mult *= valor;
        }
        System.out.println("Resultado da multiplicação: " + mult);
        System.out.println("------------------------");

        // 8 - Premiação da empresa
        for (int valor6 = 1; valor6 <= 10; valor6++) {
            System.out.print("Digite os anos de empresa do funcionário " + valor6 + ": ");
            int anos = sc.nextInt();
            if (anos > 10) {
                System.out.println("Parabéns! Você irá receber um prêmio");
            } else {
                System.out.println("Quase lá");
            }
            System.out.println("------------------------");
        }

    }
}
