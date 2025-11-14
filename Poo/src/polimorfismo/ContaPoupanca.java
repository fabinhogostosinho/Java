package polimorfismo;

public class ContaPoupanca extends Conta {
	

public ContaPoupanca(String numero, String titular, double saldo) {
		super(numero, titular, saldo);
	}

@Override
public void sacar(double valor) {
	double render = valor * 0.01;
	saldo = saldo+ valor + render;
	System.out.println("Deposito realizado");
	System.out.println("Novo saldo:"+ saldo);
}
}
