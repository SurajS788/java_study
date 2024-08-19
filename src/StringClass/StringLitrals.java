package StringClass;

public class StringLitrals {
    public static void main(String[] args) {
        // String is immutable class in java
        String name = "Edso Services";   //string litrals
       // name= "morning";                 //strored in string pool
       // name= "Evening";
        String name2= "Edso Services";    // ==used o compare strings
        System.out.println(name);
        System.out.println(name==name2);
    }
}
