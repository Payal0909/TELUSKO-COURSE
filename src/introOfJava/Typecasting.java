package introOfJava;

public class Typecasting {
    public static void main(String[] args) {
        // typecasting is done only with the compatible types of datatypes

        // If the big value is assigned to small then loss of value occurs
        //
        byte a =12;
        int b=257;
        a=(byte)b; // 257%256 as range of byte is 256 bytes as -128 to 127
        System.out.println(a);


        // c will output only initial int part i.e. 4
        float num = 4.9f;
        int c = (int)num;

        System.out.println(c);

    }
}
