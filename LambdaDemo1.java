package lambda;

interface MyInterface1 {
	int size=10; //by default public static final
    void display();  //by default  public abstract
    default void print() {
    	  System.out.println(size);
    	  
    }
}
//local variable capture
public class LambdaDemo1 {
	
	 
    public static void main(String[] args) {
        String message = "Hello, ";

        // Local variable 'message' is effectively final and captured by the lambda expression
        MyInterface1 myObj = () -> System.out.println(message  +" world!  " + MyInterface1.size);

        // Calling the display method using the lambda expression object
        myObj.display();
    }
}

