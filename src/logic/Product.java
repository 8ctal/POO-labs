package logic;

public class Product {

    public String name;
    public String typeOfProduct;
    public float price;
    public int amount;

    public Product(String name, String typeOfProduct, float price, int amount) {
        this.name = name;
        this.typeOfProduct = typeOfProduct;
        this.price = price;
        this.amount = amount;
    }

    public float calculateStoragePrice() {
        float storagePrice = 0;
        if (typeOfProduct.equalsIgnoreCase("NP")) {
            storagePrice = (float) (amount * price * 1.1);
        }
        if (typeOfProduct.equalsIgnoreCase("P")) {
            storagePrice = (float) (amount * price * 1.15);
        }
        return storagePrice;
    }

    @Override
    public String toString() {
        return name + ";" + typeOfProduct + ";" + price + ";" + amount + ";" + calculateStoragePrice() + "\n";
    }

}
