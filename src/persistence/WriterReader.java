package persistence;

import java.io.*;
import logic.Product;

public class WriterReader {

    public void writeProducts(Product product) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src/persistence/StockProducts.txt"),true))) {
            writer.write(product.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
