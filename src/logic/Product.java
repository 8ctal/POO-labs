package logic;

public class Product {

    public String name;
    public String typeOfProduct;
    public float price;
    public int quantity;

    public Product(String name, String typeOfProduct, float price, int quantity) {
        this.name = name;
        this.typeOfProduct = typeOfProduct;
        this.price = price;
        this.quantity = quantity;
    }

    public float calculateStoragePrice() {
        float storagePrice = 0;
        if (typeOfProduct.equalsIgnoreCase("NP")) {
            storagePrice = (float) (quantity * price * 1.1);
        }
        if (typeOfProduct.equalsIgnoreCase("P")) {
            storagePrice = (float) (quantity * price * 1.15);
        }
        return storagePrice;
    }

    @Override
    public String toString() {
        return name + ";" + typeOfProduct + ";" + price + ";" + quantity + ";" + calculateStoragePrice() + "\n";
    }

}
