package variables;

public class ThisforMethodCalling {

    public void method1() {
        System.out.println("run 1");
        this.method2();
    }

    public void method2() {
        System.out.println("run 2");
        this.method3();
    }

    public void method3() {
        System.out.println("run 3");
       // this.method4                    //can not use to call static method
    }
    public static void method4(){
        System.out.println("run 4");

    }

    public static void main(String[] args) {
        ThisforMethodCalling object1 = new ThisforMethodCalling();
        ThisforMethodCalling object2 = new ThisforMethodCalling();
        object1.method1();
        object2.method4();

    }
}


