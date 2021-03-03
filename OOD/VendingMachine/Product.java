package OOD.VendingMachine;

public class Product {
    private int productID;
    private float productPrice;
    private int machineID;

    public Product(int productID, float productPrice, int machineID) {
        this.productID = productID;
        this.productPrice = productPrice;
        this.machineID = machineID;
    }

    public int getProductID() {
        return productID;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public int getMachineID() {
        return machineID;
    }
}
