package lista23;

public class avaliacao {
	  private String nome;
	    private double nota1;
	    private double nota2;

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public void setNota1(double nota) {
	        if (nota < 0 || nota > 10) {
	            System.out.println("Nota inválida!");
	        } else {
	            this.nota1 = nota;
	        }
	    }

	    public void setNota2(double nota) {
	        if (nota < 0 || nota > 10) {
	            System.out.println("Nota inválida!");
	        } else {
	            this.nota2 = nota;
	        }
	    }

	    public double calcularMedia() {
	        return (nota1 + nota2) / 2;
	    }

	    public String getNome() {
	        return nome;
}
}