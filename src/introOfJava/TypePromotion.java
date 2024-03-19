package introOfJava;

public class TypePromotion {

    public static void main(String[] args) {

        // here byte*byte should be byte but since 300 is out of range it got promoted to int
        // this is called type promotion
        // It means whenever an operation is performed the result is promoted to higher datatypes
        byte a=10;
        byte b=30;
        int result = a*b;
//        byte r = a*a; it gives compile time error
        System.out.println(result);
    }
}
