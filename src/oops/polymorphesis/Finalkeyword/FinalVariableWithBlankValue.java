package oops.polymorphesis.Finalkeyword;

public class FinalVariableWithBlankValue {
   final int a;                               // final blank variable cannot be created
   final static int b;

 FinalVariableWithBlankValue(){
    a=400;
 //   b=500;      // static final variable can only be declaired within an static block
}
static {
     b=500;
    System.out.println(b);
}

    public static void main(String[] args) {
        FinalVariableWithBlankValue o=new FinalVariableWithBlankValue();
        System.out.println(o.a);

    }
}
