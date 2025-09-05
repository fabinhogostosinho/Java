package listadeex3;

import java.util.Scanner;

public class lista3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Exercício 1 - Resultado de dois números
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma é: " + soma);
        System.out.println();
        
        // Exercício 2 - Divisão e Resto
        System.out.print("Digite o primeiro número inteiro: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int b = scanner.nextInt();
        int div = a / b;
        int resto = a % b;
        System.out.println("Divisão inteira: " + div);
        System.out.println("Resto da divisão: " + resto);
        System.out.println();
        
        // Exercício 3 - Perímetro de um triângulo
        System.out.print("Digite o lado 1 do triângulo: ");
        double l1 = scanner.nextDouble();
        System.out.print("Digite o lado 2 do triângulo: ");
        double l2 = scanner.nextDouble();
        System.out.print("Digite o lado 3 do triângulo: ");
        double l3 = scanner.nextDouble();
        double perimetro = l1 + l2 + l3;
        System.out.printf("O perímetro do triângulo é: "+ perimetro);
        System.out.println();
        
        // Exercício 4 - Calculadora de Gorjeta
        System.out.print("Digite o valor da conta (R$): ");
        double conta = scanner.nextDouble();
        System.out.print("Digite a porcentagem da gorjeta: ");
        double porcen = scanner.nextDouble();
        double gorjeta = conta * (porcen / 100);
        double totalg = conta + gorjeta;
        System.out.printf("Valor da gorjeta: R$" + gorjeta);
        System.out.printf("Total a pagar: R$" + totalg);
        System.out.println();
        
        // Exercício 5 - Calculadora de área de círculo
        System.out.print("Digite o raio do círculo (em metros): ");
        double raio = scanner.nextDouble();
        double pi = 3.14159;
        double area = pi * raio * raio;
        System.out.printf("A área do círculo é: " + area + "metros quadrados");
        System.out.println();
        
        // Exercício 6 - Conversor de idade em dias
        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();
        System.out.print("Digite os meses: ");
        int meses = scanner.nextInt();
        System.out.print("Digite os dias: ");
        int dias = scanner.nextInt();
        int totald = (anos * 365) + (meses * 30) + dias;
        System.out.println("Você viveu aproximadamente " + totald + " dias.");
        System.out.println();
        
        // Exercícios 7 - Calculadora de pagamento por hora
        System.out.print("Digite o número de horas trabalhadas: ");
        double horas = scanner.nextDouble();
        System.out.print("Digite o valor pago por hora: ");
        double valorphr = scanner.nextDouble();
        double salariob = horas * valorphr;
        double imposto = salariob * 0.10;
        double salariol = salariob - imposto;
        System.out.printf("Salário bruto: R$" + salariob);
        System.out.printf("Imposto (10%): R$" + imposto);
        System.out.printf("Salário líquido: R$" + salariol);
        

		

	}

}
