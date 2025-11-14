package Lista25;

public class PagamentoPrincipal {
    public static void main(String[] args) {
        Pagamento p1 = new Pix();
        Pagamento p2 = new CartaoCredito();
        Pagamento p3 = new Dinheiro();

        p1.processarPagamento();
        p2.processarPagamento();
        p3.processarPagamento();
    }
}

