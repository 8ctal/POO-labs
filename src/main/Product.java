
package main;

public abstract class Product {
    
    private double regularPrice;
    
    public abstract double computeSalePrice();
    
    public Product(double regularPrice){
        this.regularPrice = regularPrice;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    
    @Override
    public String toString(){
        return ""+computeSalePrice();
    }
    
}
