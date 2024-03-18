package introOfJava;

public class Literals {
    public static void main(String[] args) {

          int num = 0b101;  // Binary format - [0b + 101] and 101 in binary = 5 in decimal
          System.out.println(num); // outputs 5

          int num2 = 0x7E; // 7E in hexadecimal = 126 in decimal and 0x for hexadecimal
          System.out.println(num2); //126 is output

          int num3 = 10_00_000_000;//we can add _ for readability
        System.out.println(num3); // outputs is 1000000000
    }

}
