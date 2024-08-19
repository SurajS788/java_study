package exceptionhandling;

public class Rule_8 {
    //we can define try block without catch block,
    // but we must need to use finally block
    public static void main(String[] args) {
        String name = null;
        try {
            System.out.println(name.length());
        }

        finally {
            System.out.println("final block always print");
        }System.out.println("hello");


    }
}
