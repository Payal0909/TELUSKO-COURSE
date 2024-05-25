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

}
public class StaticKeyword {
    public static void main(String[] args) {
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



    }

}
