package collectionclasses.Set;

import java.util.HashSet;

public class HasSetClass {

    public static void main(String[] args) {
 // Dublicat value not Stored
 // insertion order not preserved
 // Null value can be added only one time
 // best when frequent operation is search
        HashSet hs= new HashSet();
        hs.add("Suraj");
        hs.add("Dheeraj");
        hs.add("Dhe");
        hs.add("veeru");
        hs.add("Dheeraj");
        hs.add(null);
        hs.add(5454);

        System.out.println(hs);
    }
}
