package polimorfismo;

public class Zoologico {

	public static void main(String[] args) {
		
		Animal a1 = new Cachorro();
		Animal a2 = new Gato(); 
		
		a1.emitirSom();
		a2.emitirSom();
	}

}
