package lambda;


//lambda expression with conditional logic
interface CheckInterface {
    boolean check(int num);
}

public class LambdaDemo5 {
    public static void main(String[] args) {
        // Lambda expression to check if a number is even
        CheckInterface checkObj = (num) -> num % 2 == 0;
        System.out.println("Is 10 even? " + checkObj.check(10)); // Output: Is 10 even? true
    }
}
