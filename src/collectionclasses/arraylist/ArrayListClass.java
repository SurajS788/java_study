package collectionclasses.arraylist;

import java.util.ArrayList;

public class ArrayListClass {

    public static void main(String[] args) {


        ArrayList list1 = new ArrayList<>();
        list1.add("Suraj");               // arraylist can contain heterogeneous data and null values
        list1.add("Abhisekh");            // arraylist can contain repeated value
        list1.add("Golu");               //insertion order is preserved
        list1.add("Suraj");
        list1.add("Dheeraj");
        list1.add(3);
        list1.add(3.7);
        list1.add(null);
        list1.add(false);

        System.out.println(list1);        //it shows arraylist
        // Printing with simple for loop
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }

//        Iterator iterator = list1.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next()); //it only shows content of arraylist
//        }
   /*     for (Object o : list1){             //same like while loop
            System.out.println(o);

        }*/

    }
}