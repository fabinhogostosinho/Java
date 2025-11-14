package lista23;

public class avaliacaoMain {

	public static void main(String[] args) {
		   avaliacao a = new avaliacao();
	        a.setNome("Maria");
	        a.setNota1(9);
	        a.setNota2(8);

	        System.out.println("Aluno: " + a.getNome());
	        System.out.println("Média: " + a.calcularMedia());
	}

}
