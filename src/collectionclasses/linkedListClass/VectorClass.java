package collectionclasses.linkedListClass;

import java.util.Vector;

public class VectorClass {

    public static void main(String[] args) {

        Vector vector = new Vector();
        vector.add("Ram");
        vector.add("Suraj");
        vector.add("Abhisekh");
        vector.add("Golu");
        vector.add(null);
        vector.add(3.5);

        System.out.println(vector);
    }
}
