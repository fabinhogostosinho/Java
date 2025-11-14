package lista23;

public class contaBancaria {
	private String titular;
    private double saldo;

    public contaBancaria(String titular) {
        this.setTitular(titular);
        this.saldo = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
}
