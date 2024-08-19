package collectionclasses.arraylist;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList list1 = new ArrayList<>();
        list1.add("Suraj");                      // arraylist can contain heterogeneous data and null values
        list1.add("Abhisekh");                  // arraylist can contain repeated value
        list1.add("Golu");                      //insertion order is preserved
        list1.add(null);
        list1.add("Suraj");
        list1.add("Dheeraj");

//        ArrayList list2 = new ArrayList();
//        list2.addAll(list1);                 //adddall use to add multiple data*
//        System.out.println(list2);

        System.out.println(list1.get(0));     // get() method use to print the specific data of given index
//        System.out.println(list1.get(6));     //get index out of bound excepton
        System.out.println(list1.size());

        System.out.println(list1.remove("Dheeraj"));
        list1.remove(list1.get(4));       // method to remove with index no.
        System.out.println(list1);
/*        list1.clear();                      // clear whole list
          System.out.println(list1);    */
//        System.out.println(list1.contains("Suraj"));    // find the valur define in the method is in list or not
//        System.out.println(list1.contains("suraj"));


    }

}
