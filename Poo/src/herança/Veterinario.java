package herança;

import java.util.Scanner;

public class Veterinario {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Scanner sc = new Scanner(System.in); //Java.util
		
		System.out.println("Qual o nome do pet?");
		String nome = sc.next();
		System.out.println("Qual a raça do pet?");
		String raca = sc.next();
		
		cachorro.setNome(nome);
		cachorro.setRaca(raca);
		System.out.println("Dados:");
		cachorro.info();
		cachorro.dados();

	}

}
