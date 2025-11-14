package polimorfismo;

public class Zoologico {

	public static void main(String[] args) {
		
		Animal a1 = new Cachorro();
		Animal a2 = new Gato(); 
		
		
		Cachorro c1 = new Cachorro();
		
		a1.emitirSom();
		a2.emitirSom();
	}

}
