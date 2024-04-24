package oopsInJava;

class Calculator
{
    public int add(int n1,int n2)
    {
       return n1+n2;
    }
}

public class ObjectClass {
    public static void main(String[] args)
    {
//         Object oriented programming
//         Object - Properties and Behaviour
//         Class - Blueprint in java
//         JVM creates objects and it just need class file for that...which gets compiled to a byte code which jvm takes and then gives us the object

        int a =19;
        int b=16;
        Calculator calculator=new Calculator();
        int res=calculator.add(a,b);
        System.out.println(res);


//        At 3:13 explaining the underlying logic to it
    }
}
