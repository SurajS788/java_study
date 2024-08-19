package exceptionhandling;

public class Rule_6 {
    //we can't define parent class exception at the top and child exception in below.
    // If we are trying to define like this, you will get a compile time error.
    public static void main(String[] args) {
        String name= null;
        try {
            System.out.println(name.length());             // parent exception
        }catch (Exception e){e.printStackTrace();}
//       catch (ArithmeticException a){                    // child exception cant we created after parent
//        a.printStackTrace();}
        System.out.println("hello");

    }

}
