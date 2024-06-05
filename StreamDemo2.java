package lambda;

import java.util.Arrays;
import java.util.List;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Using Stream API to calculate sum of squares of even numbers
        int sumOfSquares = numbers.stream()
                                  .filter(num -> num % 2 == 0) // Filter even numbers
                                  .mapToInt(num -> num * num) // Square each even number
                                  .sum(); // Calculate sum of squares
                                  
        System.out.println("Sum of squares of even numbers: " + sumOfSquares);
    }
}
