package lambda;

import java.util.Arrays;
import java.util.List;

public class StreamDemo3 {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // 1. Filtering method: Filter words starting with 'a'
        System.out.println("Words starting with 'a':");
        words.stream()
             .filter(word -> word.startsWith("a"))
             .forEach(System.out::println);

        // 2. Mapping method: Convert each word to uppercase
        System.out.println("\nWords in uppercase:");
        words.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);

        // 3. Sorting method: Sort the words alphabetically
        System.out.println("\nSorted words:");
        words.stream()
             .sorted()
             .forEach(System.out::println);

        // 4. Limit method: Limit the stream to the first three words
        System.out.println("\nFirst three words:");
        words.stream()
             .limit(3)
             .forEach(System.out::println);

        // 5. Reduction method: Concatenate all words into one string
        String concatenatedWords = words.stream()
                                       .reduce("", (str1, str2) -> str1 + str2);
        System.out.println("\nConcatenated words: " + concatenatedWords);
    }
}
