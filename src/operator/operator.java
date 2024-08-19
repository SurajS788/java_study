package operator;

public class operator {
    public static void main(String[] args) {
        // postfix unary operator
         int a = 10;
         int b = a++;
         int c = b++;
         System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // prefix unary operator
        int d = 15;
        int e =++d;
        int f = e;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
