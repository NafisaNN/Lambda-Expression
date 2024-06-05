package lambda;
import java.util.*;
import java.util.stream.*;


public class StreamAPIDemo {
  public static void main(String args[]) {
	 List<String> names = Arrays.asList("John", "Alice", "Bob", "Alice", "Charlie");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
/*		List<Integer> newList=new ArrayList<>();
		for(Integer i : numbers) {
			  if(i%2==0) 
				 newList.add(i);
			
			
		} 
		System.out.println(newList);  */
		
		//Example 1
		
		List<Integer> evenNumbers =       numbers.stream()
										  .filter(n -> n % 2 == 0)
										  .collect(Collectors.toList()); 
		                                  
		System.out.println(evenNumbers); // Output: [2, 4, 6, 8, 10]
		
		     numbers.stream()
		     .filter(n->n%2==0)
		     .collect(Collectors.toList())
		     .forEach(System.out::println);
		     
		     
	//Example 2
		     List<Integer> squares = numbers.stream()
		                .map(n -> n * n)
		                .collect(Collectors.toList());
				System.out.println(squares); // Output: [1, 4, 9, 16, 25]

		 //Example 3
				
				int sum = numbers.stream()
		                .mapToInt(Integer::intValue) // converts Integer to int
		                .sum();
				System.out.println(sum); // Output: 15

		  //Example 4
				long count = names.stream()
		                 .filter(name -> name.equals("Alice"))
		                 .count();
		System.out.println(count); // Output: 2
		
		//Example  5
		boolean any = numbers.stream()
		          .anyMatch(n -> n > 3);
			System.out.println(any); // Output: true
			
	   //Example 6
			Map<Integer, List<String>> groupedNames = names.stream()
	                .collect(Collectors.groupingBy(String::length));
			System.out.println(groupedNames); // Output: {3=[Bob], 4=[John], 5=[Alice], 7=[Charlie]}

       //Example 7
			List<String> words = Arrays.asList("Hello", "World", "Java", "Streams");
			String result = words.stream()
			             .collect(Collectors.joining(", "));
			System.out.println(result); // Output: Hello, World, Java, Streams
			
	// Example 8
			    int m=      numbers.stream()
                    .max(Comparator.naturalOrder())
                    .get();
			    System.out.println(m);
			        
	//Example 9
			    List<Integer> num= Arrays.asList(2,4,6,8,10);
			    boolean allMatch = num.stream()
		                .allMatch(n -> n % 2 == 0);
				System.out.println(allMatch); // Output: true

			         
	//Example 10
				
				List<Integer> numbers1 = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
				List<Integer> distinctNumbers = numbers1.stream()
				                                      .distinct()
				                                      .collect(Collectors.toList());
				System.out.println(distinctNumbers); // Output: [1, 2, 3, 4]


				//Example 11
				List<Integer> numbers2 = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3);
				List<Integer> sortedNumbers = numbers2.stream()
				                                    .sorted()
				                                    .collect(Collectors.toList());
				System.out.println(sortedNumbers); // Output: [1, 1, 2, 3, 3, 4, 5, 5, 6, 9]

				
				//Example 12
				List<String> words1 = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
				List<Character> firstLetters = words1.stream()
				                                   .filter(word -> word.length() > 5)
				                                   .map(word -> word.charAt(0))
				                                   .collect(Collectors.toList());
				System.out.println(firstLetters); // Output: [b, e]
				
				//Example 13
				List<Integer> numbers3 = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3);
				Optional<Integer> min = numbers3.stream()
				                              .min(Comparator.naturalOrder());
				System.out.println(min.get()); // Output: 1
				
				//Example 14
				List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9));
				List<Integer> flatList = nestedList.stream()
				                                  .flatMap(List::stream)
				                                  .collect(Collectors.toList());
				System.out.println(flatList); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]

				
				//Example 15
				List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				List<Integer> limitedNumbers = numbers4.stream()
				                                      .limit(7)
				                                      .collect(Collectors.toList());
				System.out.println(limitedNumbers); // Output: [1, 2, 3, 4, 5]

				  //Example 16
				List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				List<Integer> skippedNumbers = numbers5.stream()
				                                      .skip(5)
				                                      .collect(Collectors.toList());
				System.out.println(skippedNumbers); // Output: [6, 7, 8, 9, 10]

				//Example 17
				List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5);
				double average = numbers6.stream()
				                        .mapToInt(Integer::intValue) //converts the stream of Integer objects to an IntStream
				                        .average()                   //average() is a method of IntStream, not Stream<Integer>.
				                        .orElse(0); //if stream is empty
				System.out.println(average); // Output: 3.0
				
				
				//Example 18
				List<Integer> numbers7 = Arrays.asList(1, 2, 3, 4, 5);
				boolean noneMatch = numbers7.stream()
				                          .noneMatch(n -> n > 10);
				System.out.println(noneMatch); // Output: true
				
				//Example 19
				List<String> names8 = Arrays.asList("John", "Alice", "Bob", "Charlie");
				Map<String, Integer> nameLengthMap = names8.stream()
				                                          .collect(Collectors.toMap(name -> name, String::length));
				System.out.println(nameLengthMap); // Output: {John=4, Alice=5, Bob=3, Charlie=7}

				
				//Example 20
				Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 1);
				List<Integer> limitedList = infiniteStream.limit(10)
				                                         .collect(Collectors.toList());
				System.out.println(limitedList); // Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

				
				

				

				





		
  }
	
	
}
