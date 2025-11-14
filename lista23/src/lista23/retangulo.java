package lista23;

public class retangulo {
	  private double largura;
	    private double altura;

	    public void setLargura(double largura) { this.largura = largura; }
	    public void setAltura(double altura) { this.altura = altura; }

	    public double calcularArea() {
	        return largura * altura;
	    }

	    public double calcularPerimetro() {
	        return 2 * (largura + altura);
	    }
	
}
