package ClasseFilme;

public class FilmeP {

	public static void main(String[] args) {
		
		Filme filme = new Filme();
        filme.titulo = "Inception";
        filme.genero = "Ficção Científica";
        filme.duracao = 148;
        filme.assistir();
        filme.mostrarInformacoes();

	}

}
