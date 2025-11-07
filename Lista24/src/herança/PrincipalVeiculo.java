package herança;

public class PrincipalVeiculo {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.setMarca("Toyota");
		c1.setAno(2026);
		c1.setPortas(4);
		
		
		System.out.println("Dados do carro: ");
		c1.exibirInfo();
		c1.abrirPortaMalas();
		
		

	}

}
