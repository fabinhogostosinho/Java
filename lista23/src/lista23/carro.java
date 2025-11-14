package lista23;

public class carro {
	  private int velocidadeAtual = 0;

	    public void setModelo(String modelo) { }
	    public void setAno(int ano) { }

	    public void acelerar(int valor) {
	        velocidadeAtual += valor;
	    }

	    public void frear(int valor) {
	        velocidadeAtual -= valor;
	        if (velocidadeAtual < 0) {
	            velocidadeAtual = 0;
	        }
	    }

	    public int getVelocidadeAtual() {
	        return velocidadeAtual;
	    }
}
