package variables;

public class ParameterConstructor {
    int x,y;
    ParameterConstructor(int a,int b){
        x=a;
        y=b;
        System.out.print(x +" ");
        System.out.println(y);
    }

    public static void main(String[] args) {
        ParameterConstructor object1 = new ParameterConstructor(10,20);
        ParameterConstructor object2 = new ParameterConstructor(15,25);
        ParameterConstructor object3 = new ParameterConstructor(10,30);


    }
}
