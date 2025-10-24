package Poo;

import java.util.Scanner;

public class AlunoP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno ();
		
		aluno.nome = "Marcia";
		aluno.saudacao();
		
		aluno.nota1 = 7;
		aluno.nota2 = 9;
		aluno.calcularMedia();

	}

}
