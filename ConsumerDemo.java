package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        // Create a list of names
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Define a consumer to print each name in uppercase
        Consumer<String> printUpperCase = (name) -> System.out.println(name.toUpperCase());

        // Use the consumer to print each name in uppercase
        System.out.println("Names in uppercase:");
        names.forEach(printUpperCase);
    }
}
