package herança;

public class PrincipalProduto {

	public static void main(String[] args) {
		Livro l1 = new Livro();
		l1.setNome("O Iluminado");
		l1.setAutor("Stephen King");
		l1.setPreco(79.90);
		l1.lerTrecho();
		
		Filme f1 = new Filme();
		f1.setNome("O Iluminado");
		f1.setDiretor("Stephen King");
		f1.assistir();

	}

}
