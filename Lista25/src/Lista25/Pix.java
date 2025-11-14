package Lista25;

public class Pix extends Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via PIX concluído!");
    }
}
