package exceptionhandling;

public class Rule_1 {
    // 1. use of try and catch block to catch exception so all other statment print
    public static void main(String[] args) {
        System.out.println("hello");
      try{
          System.out.println(10/0);
      }catch (ArithmeticException a){
          a.printStackTrace();}

        System.out.println("good bye");
    }


}
