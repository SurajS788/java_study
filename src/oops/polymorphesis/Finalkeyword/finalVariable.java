package oops.polymorphesis.Finalkeyword;

public class finalVariable {
    final int a= 50;
    static int b =40;
   public finalVariable(){
//        a=500;
        b=70;
        }

    public static void main(String[] args) {
        finalVariable b=new finalVariable();
        System.out.println(b.a);
        System.out.println(b.b);

    }
}
