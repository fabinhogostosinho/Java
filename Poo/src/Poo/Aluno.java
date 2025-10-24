package Poo;

public class Aluno {
	String nome;
	double nota1;
	double nota2;
	
	void calcularMedia() {
		double media = (nota1 + nota2) / 2;
		System.out.println("A média foi:" + media);
	}
	void saudacao() {
		System.out.println("Olá " + nome);
	}

}
