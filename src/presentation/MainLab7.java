package presentation;

import persistence.WriteRead;

//@author Team 4
public class MainLab7 {

    public static void main(String[] args) {
        WriteRead stock = new WriteRead();
        try {
            stock.writeProducts(stock.readProducts());
        } catch (Exception e) {
            System.out.println(e.getMessage() + e.getCause());
        }
    }
}
