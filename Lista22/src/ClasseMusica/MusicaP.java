package ClasseMusica;

public class MusicaP {

	public static void main(String[] args) {
		
		Musica musica = new Musica();
        musica.titulo = "Problemas de Confiança";
        musica.artista = "Slipmami";
        musica.duracao = 3.5;
        musica.tocar();
        musica.mostrarDetalhes();
        musica.pausar();

	}

}
