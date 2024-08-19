package collectionclasses.linkedListClass;

import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {

        // index is counted backward starting with 1
        //Stack<String> st= new Stack();   - Generic class
        Stack st= new Stack();
        st.add("suraj");
        st.push("vinod");
        st.push("vina");
        st.push("hans");
        st.add(5);

       // st.pop();         //last come first out--last added removed first

        System.out.println(st.search("suraj"));   // index 5

        System.out.println(st.peek());   // it shows top most element index

         /* for (Object o : st) {
          System.out.println(o);
              }     */

    }
}
