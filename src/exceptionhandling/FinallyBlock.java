package exceptionhandling;

public class FinallyBlock {
    public static void main(String[] args) {
        String name = null;
        try {
            System.out.println(name.length());
        } catch (ArithmeticException a) {       // child exception 1st
            a.printStackTrace();
        } finally {
            System.out.println("final block always print");
        }
        System.out.println("hello");

    }
}
