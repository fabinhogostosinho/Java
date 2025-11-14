package polimorfismo;

public class Conta {
	protected String numero;
	protected String titular;
	protected double saldo = 0;
	
	public Conta(String numero, String titular, double saldo) {
	this.numero = numero;
	this.titular = titular;
	this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("Depositar Realizado!");
		System.out.println("O novo saldo é: " + saldo);
	}
	public void sacar(double valor) {
		if(valor <= saldo) {
			saldo = saldo - valor;
			System.out.println("Saque Realizado!");
			System.out.println("O novo saldo é: " + saldo);		
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	public void exibirInfos() {
		System.out.println("Conta: " + numero);
		System.out.println("Titular: " + titular);
		System.out.println("Saldo: " + saldo);
	}

	public double getSaldo() {
		return saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	

}
