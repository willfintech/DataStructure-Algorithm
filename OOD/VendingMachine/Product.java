package OOD.VendingMachine;

public class Product {
    private int productID;
    private double productPrice;
    private int machineID;

    public Product(int productID, double productPrice, int machineID) {
        this.productID = productID;
        this.productPrice = productPrice;
        this.machineID = machineID;
    }

    public int getProductID() {
        return productID;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getMachineID() {
        return machineID;
    }
}
