package oops.polymorphesis.superKeyword;

public class circle extends Shape {

    public circle(){
        super();
    }
    public void test(){
        System.out.println(super.a);
        super.shape();                      // super only call pARENT CLASS METHOD


    }
    public void shape(){
        System.out.println("shape is circle");
    }

    public static void main(String[] args) {
        circle circle=new circle();
        circle.test();
    }
}
