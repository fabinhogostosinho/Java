package lista23;

public class carroMain {

	public static void main(String[] args) {
		  carro c = new carro();
	        c.setModelo("Civic");
	        c.setAno(2020);

	        c.acelerar(50);
	        c.frear(20);

	        System.out.println("Velocidade: " + c.getVelocidadeAtual());
	    }
	}


