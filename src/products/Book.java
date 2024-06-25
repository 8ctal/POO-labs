
package products;

import main.Product;

public class Book extends Product {
  
    private String publisher;
    private int yearPublished;

    public Book(String publisher, int yearPublished, double regularPrice) {
        super(regularPrice);
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }
    
    @Override
     public double computeSalePrice(){
        return getRegularPrice()*0.5;
    }   

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    
  
     
     
}
