package primeiroProjeto;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //java.util

		int[] idade = new int[5]; //vetor inteiro de 5 posições
		idade[0] = 18;
		idade[1] = 27;
		idade[2] = 13;
		idade[3] = 50;
		idade[4] = 40;
		System.out.println(idade[3]);
		System.out.println("-------------------------");
		String[] nomes = new String [4];
		for(int i = 0; i < 4; i++) {  //gravando dados no vetor
			System.out.println("nomes ["+i+"]: ");
			nomes[i] = sc.next();
		}
		System.out.println("-------------------------");
		System.out.println("Mostrando os valores armazenados");
		for(int i = 0; i < 4; i++) { //mostrando os dados gravados
		System.out.println(nomes[i]);
		}
		System.out.println("-------------------------");
		System.out.println("Mostrando os valores invertidos");
		for(int i = 3; i>=0; i -- ) {
		System.out.println(nomes[i]);
		}
		//Reaproveitando o vetor idades
		System.out.println("-------------------------");
		for(int i = 0; i<5; i++) {
		if(idade[i] > 18) {
		System.out.println("Maior de idade");
		} else {
		System.out.println("Menor de idade");
		}
		}
		
		
		
		
	}

}
