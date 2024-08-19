package StringClass;

public class NewString {
    public static void main(String[] args) {
        // we can always declare string with new keyword
        // string stored in heap memorey
        String a=new String("hello");
        String b=new String("hello");
        System.out.println(a==b);
        System.out.println(a.equals(b));  //.equal use to check weather two string is identical or not

    }
}
