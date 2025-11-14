package Lista25;

public class BancoPrincipal {
	public static void main(String[] args) {
        Conta c1 = new ContaPoupanca();
        Conta c2 = new ContaInvestimento();

        System.out.println("Rendimento Poupança: R$ " + c1.calcularRendimento());
        System.out.println("Rendimento Investimento: R$ " + c2.calcularRendimento());
    }
}