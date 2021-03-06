package OOD.VendingMachine;

public final class CoinPayment implements Payment{
    @Override
    public boolean pay(Product product, float payAmt) {
        // coin payment process
        return payAmt >= product.getProductPrice();
    }
}
