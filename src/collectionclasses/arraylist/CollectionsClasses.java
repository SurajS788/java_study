package collectionclasses.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClasses {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("Suraj");
        list.add("Abhisekh");
        list.add("Golu");
        list.add("suraj");
        list.add("Dheeraj");
      //  list.add(3);
      //  list.add(3.7);
      //  list.add(null);
      //  list.add(false);


        //Collections only work with heterogenious and not null values
       Collections.sort(list,Collections.reverseOrder());

         for ( Object o : list){
             System.out.println(o);      }
        Collections.reverse(list);

         //this method dont work
        /* for ( Object o : list){
            System.out.println(o);      } */


    }
}
