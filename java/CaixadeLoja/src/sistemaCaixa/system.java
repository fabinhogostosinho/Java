package sistemaCaixa;

import java.util.Scanner;

public class system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] produtos = {"Iphone 13 Pro Max Eclipse 128GB", "Iphone 15 Plus Roxo 512GB",
                             "Ipad Air Preto 10ª Geração", "Iphone 17 Pro Max Laranja 1TB",
                             "Iphone 14 Pro Branco 256GB", "Iphone 16 Rosa 512GB"};
        int[] estoque = {10, 5, 8, 12, 6, 7};

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Bem-vindo à Apple, " + nome);

        // Mostrar produtos
        System.out.println("Produtos disponíveis:");
        System.out.println("1 - " + produtos[0] + " (Estoque: " + estoque[0] + ")");
        System.out.println("2 - " + produtos[1] + " (Estoque: " + estoque[1] + ")");
        System.out.println("3 - " + produtos[2] + " (Estoque: " + estoque[2] + ")");
        System.out.println("4 - " + produtos[3] + " (Estoque: " + estoque[3] + ")");
        System.out.println("5 - " + produtos[4] + " (Estoque: " + estoque[4] + ")");
        System.out.println("6 - " + produtos[5] + " (Estoque: " + estoque[5] + ")");

        System.out.print("Escolha o número do produto: ");
        int escolha = sc.nextInt();

        String produtoEscolhido = produtos[escolha - 1];
        int qtdEstoque = estoque[escolha - 1];

        System.out.print("Quantidade desejada: ");
        int quantidade = sc.nextInt();

        if (quantidade <= 0 || quantidade > qtdEstoque) {
            System.out.println("Quantidade inválida!");
            return;
        }

        System.out.print("Valor unitário R$: ");
        double valorUnitario = sc.nextDouble();

        double total = valorUnitario * quantidade;
        double desconto = total > 200 ? 0.15 : total >= 100 ? 0.10 : 0.05;
        double valorComDesconto = total - (total * desconto);

        System.out.print("Parcelar? S/N: ");
        String parcelar = sc.next();
        int parcelas = 0;
        double valorParcela = 0;

        if (parcelar.equalsIgnoreCase("S")) {
            System.out.print("Número de parcelas (máx 5): ");
            parcelas = sc.nextInt();
            if (parcelas < 1 || parcelas > 5) parcelas = 0;
            else valorParcela = valorComDesconto / parcelas;
        }

        System.out.println("\n----- RESUMO -----");
        System.out.println("Cliente: " + nome);
        System.out.println("Produto: " + produtoEscolhido);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor original: R$ " + total);
        System.out.println("Desconto: " + (desconto * 100) + "%");
        System.out.println("Valor final: R$ " + valorComDesconto);

        if (parcelas > 0) System.out.println("Parcelado: " + parcelas + "x de R$ " + valorParcela);
        else System.out.println("Pagamento à vista");
    }
}
