import java.util.Scanner;

public class Listadeex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 - Verificar maioridade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("Você tem " + idade + " anos e é maior de idade.");
        } else {
            System.out.println("Você tem " + idade + " anos e é menor de idade.");
        }

        // 2 - Comparar dois números
        System.out.print("Digite um número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite outro número: ");
        double num2 = scanner.nextDouble();
        if (num1 > num2) {
            System.out.println("O primeiro número é maior.");
        } else {
            System.out.println("O segundo número é maior ou eles são iguais.");
        }

        // 3 - Aprovação por nota
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();
        if (nota > 7) {
            System.out.println("Aprovado: sua nota foi " + nota);
        } else {
            System.out.println("Reprovado: sua nota foi " + nota);
        }

        // 4 - Verificar número positivo
        System.out.print("Digite um número para verificar se é positivo: ");
        double numero = scanner.nextDouble();
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo ou zero.");
        }

        // 5 - Cálculo de frete
        System.out.print("Digite a distância da entrega em km: ");
        double distancia = scanner.nextDouble();
        double frete;
        if (distancia <= 50) {
            frete = 10.00;
        } else {
            frete = distancia * 0.5;
        }
        System.out.println("Valor do frete: R$ " + "%" + frete);

        // 6 - O Número é 10?
        System.out.print("Digite um número para verificar se é 10: ");
        int numero10 = scanner.nextInt();
        if (numero10 == 10) {
            System.out.println("O número é 10.");
        } else {
            System.out.println("O número não é 10.");
        }

        // 7 - Desconto para Associados
        System.out.print("Você é associado da loja? (sim/não): ");
        scanner.nextLine();
        String associado = scanner.nextLine().toLowerCase();
        if (associado.equals("sim")) {
            System.out.println("Você tem desconto.");
        } else {
            System.out.println("Você não tem desconto.");
        }

        // 8 - Cálculo de bônus por horas extras
        System.out.print("Digite o número de horas extras trabalhadas: ");
        int horasExtras = scanner.nextInt();
        double bonus;
        if (horasExtras < 10) {
            bonus = horasExtras * 20.00;
        } else {
            bonus = horasExtras * 15.00;
        }
        System.out.println("Bônus por hora extra: R$ "+ bonus);

    }
}
