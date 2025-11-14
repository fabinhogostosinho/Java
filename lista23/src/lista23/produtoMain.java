package lista23;

public class produtoMain {

	public static void main(String[] args) {
		 produto p1 = new produto();
	        p1.setNome("Teclado");
	        p1.setPreco(120.50);
	        p1.setEstoque(10);

	        System.out.println("Produto: " + p1.getNome() + 
	                           " Preço: " + p1.getPreco() + 
	                           " Estoque: " + p1.getEstoque());
	}

}
