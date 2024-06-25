
package products;

import categories.Electronics;

public class TV extends Electronics {
    
    private int size;

    public TV(int size, String manufacturer, double regularPrice) {
        super(manufacturer, regularPrice);
        this.size = size;
    }
    
    @Override
     public double computeSalePrice(){
        return getRegularPrice()*0.8;
    }  

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
     
}
