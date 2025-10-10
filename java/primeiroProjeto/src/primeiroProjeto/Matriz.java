package primeiroProjeto;

import java.util.Scanner;


public class Matriz {

	public static void main(String[] args) {
		int[][] matriz = new int [3][3];
		matriz[0][0] = 20;
		matriz[0][1] = 30;
		matriz[0][2] = 22;
		matriz[1][0] = 5;
		System.out.println(matriz[0][2]); //22
		Scanner sc = new Scanner(System.in);
		int[][] numeros = new int [2][3]; // linha, coluna
		for(int i= 0; i < 2; i++) { //linha
			for(int j = 0; j < 3; j++) {//coluna
				
				System.out.println("numeros ["+i+"]");
				numeros [1] [j] = sc.nextInt();
			}
			
		}
		for (int i=0; i<2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(numeros [i] [j]);
			}
			System.out.println("");
		}
		//diagonal principal
				int [][] num = new int [3][3];
				for(int i=0; i<3; i++) {
					for(int j=0; j<3; j++) {
						System.out.println("Valor: ");
						num[i][j] = sc.nextInt();
					}
				}
		System.out.println("Diagonal principal");
		for(int i = 0; i < 3; i++) {
			System.out.println("num["+i+"]["+i+"]:"+num[i][i]);
		}
		



	}

}
