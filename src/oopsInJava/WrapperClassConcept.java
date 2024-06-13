package oopsInJava;

public class WrapperClassConcept {
    public static void main(String[] args) {

//       Wrapper class like Integer etc. extends the object class
        int num=8; // primitive type
        Integer num1=num; //autoboxing

        int num2=num1; // auto-unboxing

        String str="12";
        int n = Integer.parseInt(str);
        System.out.println(n);
    }

}
