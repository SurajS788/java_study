package oops.Interface.DefaultMethod;

public class Bananatree implements Tree,NutTree{
    @Override
    public void fruit() {
        Tree.super.fruit();          // iplement samemethod with( interference.super.class)
        NutTree.super.fruit();      // now we can call the same default method
    }

    @Override
    public void ayurveda() {

    }

    public static void main(String[] args) {

//        Bananatree ob2=new Bananatree();// doing before overide
//        ob2.Fruit                    // bcz both interf. has same method this error occur
        Bananatree ob3 =new Bananatree();
        ob3.fruit();
    }
}
