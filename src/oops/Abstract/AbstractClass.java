package oops.Abstract;

public abstract class AbstractClass {
    public void method(){
        System.out.println("normal method");

    }
    public static void test(){
        System.out.println("static method");

    }
    abstract void test2();
     //   System.out.println("abstract method"); // abstract method can not have A BODY



    public static void main(String[] args) {
       //in abstract class we cannot create object in abstract class
      //  AbstractClass  AbstractClass = new  AbstractClass();




    }
}
