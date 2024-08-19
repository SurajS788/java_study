package StringClass;

public class SplitMethod {
    public static void main(String[] args) {

        String name = "Edso Services Private Limited";
                String[] allname=name.split(" ");// Wahtever expresion definr within "" this will get seprated
        for (String s :allname){
            System.out.println(s);
        }
    }
}
