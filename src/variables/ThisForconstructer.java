package variables;

public class ThisForconstructer {
public ThisForconstructer(){
    this(10);
    System.out.println("this is a constructer");

    }
    public ThisForconstructer(int a){
this(20,30);
        System.out.println(a);
       // this(20,30);           //- call this must be the first statment in constructer body
    }
    public ThisForconstructer(int b, int c){
    this(40,5,60);
        System.out.println(b+" " +c);

    }
    public ThisForconstructer(int e, int f,int j){
        System.out.println(e+" " +f+" "+j);
    }

    public static void main(String[] args) {
        ThisForconstructer object1=new ThisForconstructer();
    }
}
