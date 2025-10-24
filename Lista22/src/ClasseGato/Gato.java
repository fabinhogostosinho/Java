package ClasseGato;

public class Gato {
	String nome;
	String raca;
	double idade;
	
	void miar() {
		System.out.println("Miau!");
	}
	void comer() {
		System.out.println(nome + ", está comendo");
	}
	void mostrarInformacoes() {
		System.out.println("Informações:");
		System.out.println(nome);
		System.out.println(raca);
		System.out.println(idade);
		
	}

}
