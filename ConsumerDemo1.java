package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo1 {
    public static void main(String[] args) {
        // Create a consumer to add two integers and print their sum
        Consumer<Integer> obj = (a) -> {
            int b = 5; // Let's assume b is 5 for this example
            System.out.println("Addition: " + (a + b));
        };

        // Call the accept method of the consumer with a value
        obj.accept(10); // You can provide any integer value here for demonstration
    }
}
