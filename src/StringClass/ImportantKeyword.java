package StringClass;

public class ImportantKeyword {
    String a = "Suraj";
    String b = "Singh";
    String c = "good mornog every one";
    public ImportantKeyword(){

    }

    public static void main(String[] args) {
        ImportantKeyword ob = new ImportantKeyword();
        System.out.println(ob.a==ob.b);
       // to find out the length of a character it also count spaces if present
       System.out.println(ob.a.length());
       // to find the word at any given index no. index start with zero for ex suraj(0s,1u,2r,3a,4j)
        System.out.println(ob.c.charAt(18)+ " "+"this is char at");
      // to campare which string is big and with how many character
        System.out.println(ob.a.compareTo(ob.b));



    }
}
