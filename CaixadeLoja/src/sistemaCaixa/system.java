package sistemaCaixa;

import java.util.Scanner;

public class system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cadastro de produtos (nomes e estoques)
        String[] produtos = {"Iphone 13 Pro Max Eclipse 128GB", "Iphone 15 Plus Roxo 512GB", "Ipad Air Preto 10ª Geração", "Iphone 17 Pro Max Laranja 1TB", "Iphone 14 Pro Branco 256GB", "Iphone 16 Rosa 512BG"};
        int[] estoque = {10, 5, 8, 12, 6, 7};

        // Solicita nome do cliente
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Bem-vindo à Apple, " + nome + "!\n");

        // Mostra produtos e estoque
        System.out.println("Produtos disponíveis:");
        System.out.println("1 - " + produtos[0] + " (Estoque: " + estoque[0] + ")");
        System.out.println("2 - " + produtos[1] + " (Estoque: " + estoque[1] + ")");
        System.out.println("3 - " + produtos[2] + " (Estoque: " + estoque[2] + ")");
        System.out.println("4 - " + produtos[3] + " (Estoque: " + estoque[3] + ")");
        System.out.println("5 - " + produtos[4] + " (Estoque: " + estoque[4] + ")");
        System.out.println("6 - " + produtos[5] + " (Estoque: " + estoque[5] + ")");

        // Escolha do produto
        System.out.print("\nEscolha o número do produto desejado: ");
        int escolha = sc.nextInt();
        if (escolha < 1 || escolha > 6) {
            System.out.println("Opção inválida!");
        } else {
            String produtoEscolhido = produtos[escolha - 1];
            int qtdEstoque = estoque[escolha - 1];

            // Quantidade desejada
            System.out.print("Informe a quantidade desejada: ");
            int quantidade = sc.nextInt();
            if (quantidade <= 0) {
                System.out.println("Valor incorreto, informe pelo menos um produto!");
            } else if (quantidade > qtdEstoque) {
                System.out.println("Não temos essa quantidade desse produto, tente outra quantidade!");
            } else {
                // Valor do produto
                System.out.print("Informe o valor unitário do produto R$: ");
                double valorUnitario = sc.nextDouble();

                // Cálculo do total
                double totalBruto = valorUnitario * quantidade;
                double desconto = 0;

                if (totalBruto > 200) {
                    desconto = 0.15;
                } else if (totalBruto >= 100) {
                    desconto = 0.10;
                } else {
                    desconto = 0.05;
                }

                double valorComDesconto = totalBruto - (totalBruto * desconto);

                // Pergunta sobre parcelamento
                System.out.print("Deseja parcelar? (S/N): ");
                String resposta = sc.next();

                // Pergunta sobre número de parcelas
                System.out.print("Quantas parcelas (máximo 5)? ");
                int parcelas = sc.nextInt();
                double valorParcela = valorComDesconto / parcelas;

                // Mensagem final
                System.out.println("\n----- RESUMO DA COMPRA -----");
                System.out.println("Cliente: " + nome);
                System.out.println("Produto: " + produtoEscolhido);
                System.out.println("Quantidade: " + quantidade);
                System.out.println("Valor original: R$ " + totalBruto);
                System.out.println("Desconto aplicado: " + (int)(desconto * 100) + "%");
                System.out.println("Valor com desconto: R$ " + valorComDesconto);
                System.out.println("Parcelado em " + parcelas + "x de R$ " + valorParcela);
                System.out.println("-----------------------------");
                System.out.println("Obrigado pela compra, " + nome + "! Volte sempre!");
            }
        }
    }
}
