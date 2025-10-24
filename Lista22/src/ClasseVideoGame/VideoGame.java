package ClasseVideoGame;

public class VideoGame {
	String marca;
    String modelo;
    boolean ligado;

    void ligar() {
        ligado = true;
        System.out.println("O console está ligado.");
    }

    void desligar() {
        ligado = false;
        System.out.println("O console foi desligado.");
    }

    void verificarStatus() {
        if (ligado) {
            System.out.println("O console está ligado.");
        } else {
            System.out.println("O console está desligado.");
        }
    }
}
