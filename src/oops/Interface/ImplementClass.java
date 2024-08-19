package oops.Interface;

public class ImplementClass implements bMW,Audi{

    @Override
    public void performance() {
        System.out.println("this is performance");
    }

    public static void main(String[] args) {
        ImplementClass ob =new ImplementClass();
        ob.performance();
    }
}
