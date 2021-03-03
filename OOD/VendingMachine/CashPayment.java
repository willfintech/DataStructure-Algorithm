package OOD.VendingMachine;

public final class CashPayment implements Payment{
    @Override
    public boolean pay(Product product, float payAmt) {
        // cash payment process
        return payAmt >= product.getProductPrice();
    }
}
