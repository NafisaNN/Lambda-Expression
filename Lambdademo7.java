package lambda;
//lambda expression with multiline

@FunctionalInterface   //annotation
interface Operation {
    int operate(int a, int b);
   
}

public class Lambdademo7 {
    public static void main(String[] args) {
        // Lambda expression to perform addition and multiplication of two numbers
        Operation op = (a, b) -> {
            int sum = a + b;
            int product = a * b;
          //  System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
            return sum; // Returning sum, but you can return any value here
        };

        int result = op.operate(5, 3);
        System.out.println("Result: " + result);
    }
}
