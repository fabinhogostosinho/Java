package ClassePizza;

public class Pizza {
	String sabor;
    String tamanho;
    boolean bordaRecheada;

    void preparar() {
        System.out.println("Preparando pizza de " + sabor + "...");
    }

    void assando() {
        System.out.println("Assando pizza tamanho " + tamanho + "...");
    }

    void mostrarInformacoes() {
        System.out.println("Sabor: " + sabor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Borda Recheada: " + (bordaRecheada ? "Sim" : "Não"));
    }
}