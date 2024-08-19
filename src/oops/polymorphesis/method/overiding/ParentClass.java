package oops.polymorphesis.method.overiding;

public class ParentClass {
    public void education(){
        System.out.println("parent want engineering");
    }

    public static void main(String[] args) {
        ParentClass ParentClass=new ParentClass();
        ParentClass.education();

    }

    public static class MethodOverloading {              //there are two way to achive method overloading

        public void addition(int a, int b){      // 1. by changing no .of variable
            System.out.println(a+b);
        }
        public void addition(int a, int b,int c){
            System.out.println(a+b+c);
        }
        public void subtraction( int x,int y){     // 2. by changing the data type
            System.out.println("subtraction"+" " + (y-x));
        }
    public void subtraction( int x,double y){
            System.out.println("subtraction"+" " + (y-x));
        }

        public static void main(String[] args) {
            MethodOverloading MethodOverloading= new MethodOverloading();
            MethodOverloading.addition(10,20,30);
            MethodOverloading.addition(30,50);
            MethodOverloading.subtraction(20,40);
            MethodOverloading.subtraction(20,40.4);

        }

    }
}
