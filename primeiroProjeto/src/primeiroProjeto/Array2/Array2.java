package primeiroProjeto.Array2;

import java.util.Scanner;


public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] idade = new int [5];
		idade[0] = 20;
		idade[1] = 22;
		idade[2] = 16;
		idade[3] = 30;
		idade[4] = 40;
		System.out.println(idade [3]);
		
		double[] salario = new double [3];
		for(int i =0; i<salario.length; i++) { //length mede o tamanho do vetor
			System.out.print("salario "+i+":");
			salario [i] = sc.nextDouble();
		}
		System.out.println("Mostrando vetor");
			for(int i = 0; i<3; i++) {
				System.out.println("salario "+i+":" +salario[1]);
			}
			
			String[] avaliacao = new String[5];
			for(int i=0; i<5; i++) {
				System.out.println("Informe sua avaliação: ");
					avaliacao[i] = sc.next();
					if (avaliacao[i].equalsIgnoreCase ("bom")) {
						System.out.println("Obrigado");
					} else {
						System.out.println("Tchau");
					}
			}
		/*Crie um vetor de três posições e mostre ele de ao contrario*/
			int[] num = new int [3];
			String[] vetor [];
			for(int i=0;i<3; i++) {
				System.out.println("vetor["+i+"]: ");
				vetor[i] = sc.next();
			}
			for(int i=2; i>=0; i--) { // ao contrário
				System.out.println("vetor"+i+"]:"+vetor[i]);
			}
			
			
			
		
		

		
	}

}
