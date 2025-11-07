package herança;

public class Retangulo extends Forma{
	public double calcularArea() {
		return getLargura() * getAltura();
		
	}

	public double calcularPerimetro() {
		return 2 * (getLargura() + getAltura());
	}
}
