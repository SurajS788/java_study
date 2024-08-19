package wrapperclass;

public class WrapperClass {
    public static void main(String[] args) {

        int i= 100;
        Integer integer=i;    // Autoboxing converting primitive datatype to wrapper class
        System.out.println(integer);
        int a = integer;     // unboxing
        System.out.println(a);
    }
}
