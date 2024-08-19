package exceptionhandling;

public class NeedOfExceptionHandling {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("good morning");
        System.out.println(10/0);           // after exception 4th line not printed
        System.out.println("good bye");
    }
}
