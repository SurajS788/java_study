package oops.Interface.DefaultMethod;

public class OrangeTree implements Tree {
    @Override
    public void ayurveda() {

    }

    public static void main(String[] args) {
        OrangeTree ob4 = new OrangeTree();
        ob4.pie();                       // we can call any method we want from interferene class
        Tree.interferanceMethod();       // this way is to declare static method and same way for main method
    }
}
