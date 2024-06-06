package oopsInJava;

class X{
    public void show()
    {
        System.out.println("in X show");
    }
}
class Y extends X{
    public void show()
    {
        System.out.println("in Y show");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Y y =new Y();
        y.show();

        // show method in Y overrides show method in X that is
        // child overrides parent's features
    }

//    Packages - it a folder and it is imported to use the files inside
//    By default , java.lang package is already there for "sout"
//    utils package for input
//    com.google.*    -> here * denotes files not folders



}
