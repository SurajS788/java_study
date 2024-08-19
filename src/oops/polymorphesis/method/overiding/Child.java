package oops.polymorphesis.method.overiding;

public class Child extends ParentClass {

    public void education() {


        System.out.println("child want to be a doctor");
    }

    public static void main(String[] args) {

        Child Child = new Child();
        Child.education();
    }
}