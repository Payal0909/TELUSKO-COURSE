package introOfJava;

public class Operators {
    public static void main(String[] args) {
        int num =5;
        // post increment
        int a = num++;  // num is assigned as 5 in a and then incremented to 6
        System.out.println(a);
       // pre increment
        int b = ++num; // here num is first incremented to 7 then assigned to b
        System.out.println(b);
    }
}
