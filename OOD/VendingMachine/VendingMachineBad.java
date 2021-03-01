//package OOD.VendingMachine;
//
//public class VendingMachineBad {
//    public boolean payment(String productID, PaymentType paymentType, double val) {
//        Product product = getProductbyID(productID);
//        switch(paymentType) {
//            case PaymentType.COIN:
//                payByCoin(product, val);
//                break;
//            case PaymentType.CASH:
//                payByCash(product, val);
//                break;
//            case PaymentType.CARD:
//            default:
//                throw new IllegalArgumentException("Unsupported Payment");
//        }
//    }
//}
