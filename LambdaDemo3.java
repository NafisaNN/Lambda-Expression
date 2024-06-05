package lambda;

@FunctionalInterface
interface MyInterface3 {
    void display();
}

public class LambdaDemo3 {
    private static String message = "Hello, ";

    public static void main(String[] args) {
       MyInterface3 obj= () -> {
    	   //message =message+  "world!";  a=a+b;   same as a+=b;
    	    message += "world!";
           System.out.println(message);
       };
       obj.display();
    }

   
}
