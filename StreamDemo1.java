package lambda;

import java.util.Arrays;
import java.util.List;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        /* List<Integer number =new ArrayList<>();
         * number.add(1);
         * number.add(2);
         *.........
         */
        
        // Using Stream API to filter and print even numbers
        System.out.println("Even numbers:");
        numbers.stream()
               .filter(num -> num % 2 == 0) // Filter even numbers
               .forEach(System.out::println); // Print each even number
    }
}
