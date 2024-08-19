package collectionclasses.linkedListClass;

import java.util.LinkedList;

public class LinkedListClass {

    public static void main(String[] args) {

//Allmost same ass Arraylist
// no shifting in memmory unlike arraylist
        LinkedList llist = new LinkedList();
        llist.add("Ram");
        llist.add("Suraj");
        llist.add("Abhisekh");
        llist.add("Golu");
        llist.add(null);
        llist.add(3.5);

        for ( Object o : llist){
            System.out.println(o);
        }
        System.out.println(llist.size());
        System.out.println(llist.indexOf("Suraj"));
    }
}