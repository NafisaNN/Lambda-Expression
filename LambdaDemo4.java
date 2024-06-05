package lambda;
//lambda expression with parameters
interface AddInterface {
    int add(int a, int b);
}

public class LambdaDemo4 {
    public static void main(String[] args) {
        // Lambda expression to add two integers
        AddInterface addObj = (a, b) -> a + b;
        System.out.println("Sum: " + addObj.add(5, 3)); // Output: Sum: 8
    }
}
