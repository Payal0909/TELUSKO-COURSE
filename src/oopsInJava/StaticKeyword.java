package oopsInJava;

class Mobile{

    String name;
    String brand;
    static String type;

    static
    {
        // this will be called first and before constructor
        type="game";
        System.out.println("in static block");
    }

    public static void show()
    {
        System.out.println("static method");
    }

}
public class StaticKeyword {
    public static void main(String[] args) throws ClassNotFoundException {
        // Static variable of a class is shared by all its objects
        // Static variable can be called by its Method directly
        // there is aa different area in JVM where these static variables are created

        Mobile m1=new Mobile();
        m1.brand="M1";
        m1.name="oppo";
//        Mobile.type="Android";

        Mobile m2=new Mobile();
        m2.brand="M2";
        m2.name="oppo";

        System.out.println(m1.brand + ": " + Mobile.type);
        System.out.println(m2.brand + ": " + Mobile.type);

//        m2.type="Mac";
        System.out.println(m1.brand + ": " + Mobile.type);
        System.out.println(m2.brand + ": " + Mobile.type);


//        Static block is called before constructor as it gets called when the class loads which is done
//        at the time of object creation but if wee want to load the class without object creation then below
//        are the steps

        Class.forName("oopsInJava.Mobile");

        // only static variable can be used inside static method and called using class name only

    }

}
