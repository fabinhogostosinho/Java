package ClasseCB;

public class ContaB {
	String titular;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    void mostrarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: R$" + saldo);
    }
}
