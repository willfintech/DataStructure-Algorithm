package OOD.VendingMachine;

public class CardPayment implements Payment {
    @Override
    public boolean pay(Product product, float value) {
        // credit payment process
        return value >= product.getProductPrice();
    }
}
