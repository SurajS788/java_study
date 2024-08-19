package oops.Interface.DefaultMethod;

public class AppleTree implements Tree{
    @Override
    public void ayurveda() {
        System.out.println();
    }

    public static void main(String[] args) {
        AppleTree ob = new AppleTree();      // to call default method
        ob.fruit();
    }
}
