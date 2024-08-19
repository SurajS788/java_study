package exceptionhandling;

public class Rule_4 {
    /*If we are having multiple statement in the try block ex 3 statement but
      we got the error on the 2 statement so, try block will be terminate.
        and only 2 will print
     */
    public static void main(String[] args) {
        try {
            System.out.println("hello");
            System.out.println("good morning");
            System.out.println(10 / 0);           // after exception 4th line not printed
            System.out.println("good bye");
        } catch (ArithmeticException a) {
            a.printStackTrace();
        }
    }
}