package Poo;

import java.util.Scanner;

public class LampadaP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lampada la = new Lampada();
		la.verificarStatus();
		la.acender();
		la.verificarStatus();
		la.apagar();
		la.verificarStatus();
		
		System.out.println("Como está a lâmpada?");
		la.ligada = sc.nextBoolean();
		la.verificarStatus();

	}

}
