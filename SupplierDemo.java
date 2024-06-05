package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        // Define a supplier to generate random numbers
        Supplier<Double> randomSupplier = () -> Math.random();

        // Get and print random numbers
        System.out.println("Random numbers:");
        for (int i = 0; i < 5; i++) {

            System.out.println(randomSupplier.get());
        }
    }
}
