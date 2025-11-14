package polimorfismo;

public class ContaCorrente extends Conta {
	public ContaCorrente(String numero, String titular, double saldo) {
		super(numero, titular, saldo);
	}

	private int taxa = 5;
	
	@Override
	public void sacar(double valor) {
		double total = valor +taxa;
		if(total <= saldo) {
			saldo = saldo - total;
			System.out.println("Saque Realizado!");
			System.out.println("Taxa de R$ 5.00 cobrada");
			System.out.println("O novo saldo é: " + saldo);
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

}
