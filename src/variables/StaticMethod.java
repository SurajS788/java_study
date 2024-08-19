package variables;

public class StaticMethod {
    public void Normal_method(){            // normal method
        int a=1000;
        System.out.println(a);
    }

    public static void Static_method(){   // static method
      //  int b = 2000;                     // can not call instance variable in static method
        System.out.println("hello");
    }

    public static void main(String[] args) {
        StaticMethod object1= new StaticMethod();
        object1.Normal_method();
        Static_method();                             //static method called
       // System.out.println();
    }
}
