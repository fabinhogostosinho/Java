package lista23;

public class retanguloMain {

	public static void main(String[] args) {
		  retangulo r = new retangulo();
	        r.setLargura(5);
	        r.setAltura(3);

	        System.out.println("Área: " + r.calcularArea());
	        System.out.println("Perímetro: " + r.calcularPerimetro());
	}

}
