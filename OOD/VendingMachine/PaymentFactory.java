package OOD.VendingMachine;

public class PaymentFactory {
    public static Payment getPayment(PaymentType paymentType) {
        switch (paymentType) {
            case CASH:
                return new CashPayment();
            case COIN:
                return new CoinPayment();
            case CARD:
                return new CardPayment();
            default:
                throw new IllegalArgumentException("Unsupported Payment Type");
        }
    }
}
