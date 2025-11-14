package Lista25;

public class CartaoCredito extends Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento com cartão de crédito aprovado!");
    }
}

