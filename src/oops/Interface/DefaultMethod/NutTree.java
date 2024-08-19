package oops.Interface.DefaultMethod;

public interface NutTree {
   default void fruit(){
       System.out.println("this is from 2nd interference");
   }
   public static void interferanceMethod(){
       System.out.println("static method in interferance");
   }
}
