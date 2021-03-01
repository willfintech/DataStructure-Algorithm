//package OOD.VendingMachine;
//
//// 要考虑到scalibility，如果要添加支付方式时，添加多种type时，要考虑不同开发者的merge conflict
//// 遇见枚举时，要考虑抽象继承，进行动态绑定。系统根据用户的选择进行动态适配
//// 进行测试时，还能添加FakeCreditCardPayment，除了和银行交互的API，其余一律和CreditCardPayment相同
//
//// 如果只有一种payment type，就不用抽象成interface了
//
//import java.util.HashMap;
//
//public class VendingMachine {
//    int machineID;
//    int[] location;
//    int[][] display;
//    HashMap<String, Integer> storage;  // indicate available amount of each drink
//
//    // choose product by product Icon or productName
//    public boolean pay(PaymentType paymentMethod, String productName) {
//    }
//
//    // choose product base on the display
//    public boolean pay(PaymentType paymentMethod, int[][] productLoc) {
//    }
//}
