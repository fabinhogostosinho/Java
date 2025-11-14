package lista23;

public class contaBancariaMain {

	public static void main(String[] args) {
		contaBancaria c = new contaBancaria("João");

        c.depositar(500);
        c.sacar(200);

        System.out.println("Saldo: " + c.getSaldo());
	}

}
