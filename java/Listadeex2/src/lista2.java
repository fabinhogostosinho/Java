import java.util.Scanner;

public class lista2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 - Resultado de dois números
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número (não pode ser zero): ");
        double num2 = scanner.nextDouble();
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));
        System.out.println();

        // 2 - Cálculo de temperatura
        System.out.println("Informe a temperatura em ° Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println(celsius + "°C equivalem a " + fahrenheit + "°F");
       
        // 3 - Conversão de valor
        System.out.print("Digite o valor em reais: ");
        double real = scanner.nextDouble();
        double dolar = real / 5.70;
        System.out.println( "R$" + real +  " equivalem a US$ " + dolar);
        
        // 4 - Área do retângulo
        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("A área do retângulo é " + area);
        
        // 5 - Conversor de idade
        System.out.print("Digite sua idade em anos: ");
        int idade = scanner.nextInt();
        int meses = idade * 12;
        System.out.println("Você já viveu aproximadamente " + meses + " meses.");
        
        // 6 - Conversor de minutos para segundos
        System.out.print("Digite o tempo em minutos: ");
        int minutos = scanner.nextInt();
        int segundos = minutos * 60;
        System.out.println(minutos + " minutos equivalem a " + segundos + " segundos.");
        
        // 7 - Custo da compra
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();
        double total = preco * quantidade;
        System.out.printf("O custo total é R$"+ total);
        
        // 8 - Divisão da conta de restaurante
        System.out.print("Digite o valor total da conta: ");
        double valorTotal = scanner.nextDouble();
        System.out.print("Digite o número de pessoas: ");
        int pessoas = scanner.nextInt();
        double valorPP = valorTotal / pessoas;
        System.out.printf("Cada pessoa deve pagar R$" + valorPP);
       
        // 9 - Cálculo de troco
        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        System.out.print("Digite o valor pago: ");
        double valorPago = scanner.nextDouble();
        double troco = valorPago - valorCompra;
        System.out.printf("O troco é R$" + troco);


        
        
      
    }
}
