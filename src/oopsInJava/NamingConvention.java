package oopsInJava;

class A{
    public void show()
    {
        System.out.println("this is show");
    }
}
public class NamingConvention {
    public static void main(String[] args) {

//        class => Calc,Human etc.
//        variables => marks ,age etc.
//        Constants => READ, AGE etc.
//        java uses camelcase letters : myMarks,


//        Anonymous objects - objects which are created without objects
        new A().show();
//        these objects can only be used once.
    }

}
