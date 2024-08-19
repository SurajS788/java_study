package oops.polymorphesis.Finalkeyword;

public  class FinalMethodExample {

   final public void method(){                //this method cant be overiden
        System.out.println("parenet wishese");

    }

    public static void main(String[] args) {
        FinalMethodExample o=new FinalMethodExample();
        o.method();
    }
}
   // final class cvant be extended into child class;