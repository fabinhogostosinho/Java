package ClasseProduto;

public class ProdutoP {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
        produto.nome = "Camiseta";
        produto.preco = 59.90;
        produto.estoque = 10;
        produto.vender(3);
        produto.mostrarInformacoes();

	}

}
