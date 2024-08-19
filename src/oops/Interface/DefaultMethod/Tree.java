package oops.Interface.DefaultMethod;

public interface Tree {
    void ayurveda();
    default void fruit(){
        System.out.println("This fruit is apple"); // this is default method

    }
    default void pie (){
        System.out.println("This is for orange tree");
    }
    public static void interferanceMethod(){
        System.out.println("static method in interferance");
    }
}
