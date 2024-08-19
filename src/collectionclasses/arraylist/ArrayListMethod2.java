package collectionclasses.arraylist;

import java.util.ArrayList;

public class ArrayListMethod2 {
    public static void main(String[] args) {


        ArrayList list1 = new ArrayList<>();
        list1.add("Suraj");
        list1.add("Abhisekh");
        list1.add("Golu");
        list1.add(null);
        list1.add("Suraj");
        list1.add("Dheeraj");
        list1.add("Dheeraj");

        ArrayList list2 = new ArrayList<>();
        list2.add("Suraj");
        list2.add("Abhisekh");
        list2.add("Golu");
        list2.add(null);

//        System.out.println(list1.containsAll(list2));     //true
//        System.out.println(list2.containsAll(list1));      //false

        System.out.println(list1.equals(list2));     //difference b/w contain and equal is equal check all the things have to equal
        System.out.println(list2.isEmpty());        // list is empty or not
        System.out.println(list2.removeAll(list2)); //work similar to clear method
        System.out.println(list2 + "hello");
    }
}
