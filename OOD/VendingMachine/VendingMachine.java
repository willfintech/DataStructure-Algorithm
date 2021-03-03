package OOD.VendingMachine;

// 要考虑到scalibility，如果要添加支付方式时，添加多种type时，要考虑不同开发者的merge conflict
// 遇见枚举时，要考虑抽象继承，进行动态绑定。系统根据用户的选择进行动态适配
// 进行测试时，还能添加FakeCreditCardPayment，除了和银行交互的API，其余一律和CreditCardPayment相同

// 如果只有一种payment type，就不用抽象成interface了

import java.util.HashMap;

public class VendingMachine {
    private final String machineId;
    int[] location;  // vending machine physical location, [latitude, longitude]
    HashMap<String, Product> buttonToProduct;
    HashMap<Product, Integer> storage;  // indicate available amount of each drink

    public VendingMachine(String machineId) {
        this.machineId = machineId;
    }

    // choose product by productName
    public boolean pay(String button, PaymentType paymentType, float payAmt) {
        Product product = buttonToProduct.get(button);
        Payment payment = PaymentFactory.getPayment(paymentType);
        return payment.pay(product, payAmt);
    }

    public void loadProduct(String button, Product product) {
        buttonToProduct.put(button, product);
        storage.put(product, storage.getOrDefault(product, 0) + 1);
    }

    public void removeProudct(Product product) {
        int count = storage.get(product);
        if (count < 0) {
            throw new IllegalArgumentException("Out of Stock");
        }
        storage.put(product, storage.get(product) - 1);
    }
}
