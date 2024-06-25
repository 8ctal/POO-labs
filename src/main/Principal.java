
package main;

import products.TV;
import products.Book;
import products.MP3Player;

public class Principal {

    public static void main(String[] args) {
        
        Product vProducts [] = new Product [6];
        
        double precioSinDescuento=0;
        double precioConDescuento=0;
        double valorAhorrado=0;
        
        vProducts[0] = new TV(60,"Samsung",2000000);
        vProducts[1] = new MP3Player("Negro","JBL",350000);
        vProducts[2] = new Book("Napoleon Hill", 1937, 120000);
        vProducts[3] = new TV(52, "Sony", 1500000);
        vProducts[4] = new MP3Player("Azul", "BOSE", 700000);
        vProducts[5] = new Book("Vadim Zeeland", 2010, 90000);
        
        for(Product product: vProducts){
            System.out.println("----------------------------------------");
            System.out.println(product.getClass().getSimpleName());
            System.out.println("Precio con descuento: "+product);
            System.out.println("Precio regular: " + product.getRegularPrice());
            System.out.println("Valor ahorrado: "+ (product.getRegularPrice() - product.computeSalePrice()));
            System.out.println("----------------------------------------");
            precioSinDescuento += product.getRegularPrice();
            precioConDescuento+= product.computeSalePrice();
            valorAhorrado += (product.getRegularPrice() - product.computeSalePrice());
           
        }
        System.out.println("Total a pagar: "+ precioConDescuento+ " Total sin descuento: "+precioSinDescuento+ " Total ahorrado: "+valorAhorrado);
    }
    
}
