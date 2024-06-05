package lambda;
//lambda expression with generic interface
interface MyGenericInterface<T> {
    T operate(T a, T b);
}

public class LambdaDemo6 {
    public static void main(String[] args) {
        // Lambda expression to find the maximum of two numbers
        MyGenericInterface<Integer> maxObj = (a, b) -> Math.max(a, b);
        System.out.println("Max: " + maxObj.operate(10, 5)); // Output: Max: 10
    }
}




