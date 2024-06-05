package lambda;
import java.util.*;




@FunctionalInterface
interface MyInterface {
    void myMethod(); // Functional interface with a single abstract method
    
    default void print() {
    	   System.out.println("Default method");
    }
    static void display() {
 	   System.out.println("dispaly method");
 }
}

public class LambdaDemo {
    public static void main(String[] args) {
        // Using lambda expression to implement MyInterface
        MyInterface myObj = () -> System.out.println("Executing myMethod using lambda expression");
        
        // Calling the method using the lambda expression
        myObj.myMethod();
        myObj.print();
        MyInterface.display();
    }
}
