import java.util.Random;
import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        /*Warehouse warehouse = new Warehouse();
        warehouse.addFruits("peach", 3);
        warehouse.addFruits("pineapple", 5);
        warehouse.addFruits("mango", 1);
        warehouse.addFruits("orange", 5);
        warehouse.addFruits("banana", 2);

        if (warehouse.takeFruit("orange")) {
            System.out.println("This orange was delicious!");
        }
        else {
            System.out.println("Sorry, no oranges left");
        }
        warehouse.printAllFruits();*/
        int tries = 5;
        int guess = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tries; i++) {
            System.out.println("Guess the number: ");
            int userGuess = scanner.nextInt();
            if (userGuess == guess) {
                System.out.println("You guessed the number!");
                break;
            } else {
                System.out.println("Try again! yo have left: " + (tries - i -1 ) + " tries!");
            }
        }
        scanner.close();
    }
}
