package Callby;

public class CallByValue {
    int data=400;

    public void test(int data){

        data = data +20;
        System.out.println("in the method" +data);
    }

    public static void main(String[] args) {
        CallByValue ob=new CallByValue();
        ob.test(10);
        System.out.println(ob.data);
    }
}
