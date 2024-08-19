package StringClass;

public class StringBufferClass {
    public static void main(String[] args) {
        String name = "Suraj Singh";

      //  StringBuffer sb = new StringBuffer("Suraj Singh");  2nd method-valid
        StringBuffer sb = new StringBuffer(name);
        System.out.println(sb.append("Rajput"));  // append use to add string at last
        // insert use to add string b/w
     //   System.out.println(sb.insert(2,"india"));
      //  System.out.println(sb.replace(5,7,"india"));
        // to delete
       System.out.println(sb.delete(2,6));
        System.out.println(sb.reverse());
    }
}
