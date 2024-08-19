package variables;

public class InstanceAndStaticVar{
    int a = 500 ;    //instance variable- call with object in class
    static int b = 100;  // static variable

    public static void main(String[] args) {
        System.out.println(b);                                       // to print static
        InstanceAndStaticVar object1 = new  InstanceAndStaticVar(); // to print instance variavle
        System.out.println(object1.a);
    }













}
