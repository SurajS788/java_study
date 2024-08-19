package collectionclasses.arraylist;

import java.util.ArrayList;

public class GenericArrayClasses {

    public static void main(String[] args) {

        //  ArrayList<int> list = new ArrayList<>();          // do not support primitive data type

        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(20);
        list.add(769);
        list.add(89);
        list.add(60);
      //  list.add("hello");                                 //can't and any thing else than integer
        System.out.println(list);
        System.out.println(list.get(2));


    }
}
