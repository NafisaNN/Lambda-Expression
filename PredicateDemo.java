package lambda;

import java.util.function.Supplier;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // Define a predicate to check if a number is even
        Predicate<Integer> isEven = (num) -> num % 2 == 0;

        // Test the predicate
        System.out.println("Is 5 even? " + isEven.test(5));
        System.out.println("Is 10 even? " + isEven.test(10));
    }
}
