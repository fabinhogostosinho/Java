package ClasseCB;

public class ContaBP {

	public static void main(String[] args) {
		
		ContaB conta = new ContaB();
        conta.titular = "Fábio Souza";
        conta.saldo = 500.0;
        conta.depositar(200.0);
        conta.sacar(100.0);
        conta.mostrarSaldo();


	}

}
