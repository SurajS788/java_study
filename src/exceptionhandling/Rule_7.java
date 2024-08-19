package exceptionhandling;

public class Rule_7 {
    //we can define child class exception first then
    // we can define parent class exception below.

    public static void main(String[] args) {
        String name = null;
        try {
            System.out.println(name.length());
        } catch (ArithmeticException a) {       // child exception 1st
            a.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();                // parent exception
        }

        System.out.println("hello");

    }
}