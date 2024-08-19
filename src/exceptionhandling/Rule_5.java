package exceptionhandling;

public class Rule_5 {
    //when we don't know about which exception, we get then we can directly define Exception
    public static void main(String[] args) {
        String name= null;
        try {
            System.out.println(name.length());
        }catch (Exception e){e.printStackTrace();}
    }
}
