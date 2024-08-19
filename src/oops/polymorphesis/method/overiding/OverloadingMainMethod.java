package oops.polymorphesis.method.overiding;

public class OverloadingMainMethod {


    public static void main(int a,int b) {
        System.out.println(a+b);

    }

    public static void main(int a,int b,int c) {
        System.out.println(a+b+c);



    }
    public static void main(String[] args) {
        main(10,20);
        main(40,50,70);

    }
}
