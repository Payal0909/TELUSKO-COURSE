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

}
