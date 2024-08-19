package exceptionhandling;

public class Rule_3 {
    // you can use multiple catch block on single try block
    public static void main(String[] args) {
        try{
            System.out.println(10/0);}
        catch (ArithmeticException a){
            a.printStackTrace();
        }catch (NullPointerException a){
            a.printStackTrace();
        }
        System.out.println("hello");
    }
}
