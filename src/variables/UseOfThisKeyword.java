package variables;

public class UseOfThisKeyword {
    int a,b;

    UseOfThisKeyword(int a,int b){
        this.a=a;
        this.b=b;
    }

       public void method1(){
            System.out.println(a);
            System.out.println(b);

        }


    public static void main(String[] args) {
        UseOfThisKeyword object1=new UseOfThisKeyword(10,20);
        object1.method1();
    }

}
