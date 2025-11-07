package herança;

public class PrincipalAnimal {

	public static void main(String[] args) {
		Cachorro c1 = new Cachorro();
		c1.setNome("Príncipe");
		c1.setIdade(7);
		c1.setRaca("SRD");
		
		Gato g1 = new Gato();
		g1.setNome("Tiger");
		g1.setIdade(7);
		g1.setCor("Cinza");
		
		System.out.println("Dados do cachorro:");
		c1.mostrarInfo();
		c1.abanarRabo();
		System.out.println("Dados do gato:");
		g1.subirNoMuro();
	}

}
