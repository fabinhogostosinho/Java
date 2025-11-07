package herança;

import java.util.Scanner;

public class Formula {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		ret.setAltura(5);
		ret.setLargura(3);
		System.out.println(ret.calcularArea());
		System.out.println(ret.calcularPerimetro());
		
		double largura, altura;
		System.out.println("Qual a Largura? ");
		largura = sc.nextDouble();
		System.out.println("Qual a altura? ");
		altura = sc.nextDouble();
		ret.setAltura(altura);
		ret.setLargura(largura);
		System.out.println(ret.calcularArea());
		System.out.println(ret.calcularPerimetro());
		

	}

}
