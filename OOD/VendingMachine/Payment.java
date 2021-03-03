package OOD.VendingMachine;

interface Payment {  // 同一个Package
    abstract boolean pay(Product product, float payAmt);
}
