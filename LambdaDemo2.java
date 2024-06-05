package lambda;

interface MyInterface2 {
    void display();
}
//instance vatiable capture
public class LambdaDemo2 {
    private String message = "Hello, ";
     private static int a=1;

    public static void main(String[] args) {
        LambdaDemo2 demo = new LambdaDemo2();
   
        demo.performAction();
    }

    public void performAction() {
        // Lambda expression captures the instance variable 'message'
        MyInterface2 myObj = () -> {
            message += "world!";
            System.out.println(message);
            System.out.println("Static a" +a);
        };

        // Calling the display method using the lambda expression object
        myObj.display();
    }
}
