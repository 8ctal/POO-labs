package persistence;

import java.io.*;
import java.util.*;
import logic.Product;

public class WriteRead {

    public List<Product> readProducts() throws IOException {
        List<Product> prodList = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("files/products.txt")))) {
            String line = reader.readLine();
            while (line != null) {
                String[] items = line.split(";");
                Product product = new Product(items[0], items[1], Float.parseFloat(items[2]), Integer.parseInt(items[3]));
                prodList.add(product);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return prodList;
    }

    public void writeProducts(List<Product> products) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File("files/output/productsFinal.txt")))) {
            for (Product pr : products) {
                writer.write(pr.toString());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
