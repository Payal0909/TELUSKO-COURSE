package oopsInJava;
class Calc
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
    public double add(double n1,int n2)
    {
        return n1+n2;
    }
}

public class MethodOverloading {
    public static void main(String[] args)
    {
//       Method overloading - when one method is defined multiple times inside the class
//       with different parameters in number or different types of parameters

        Calculator calculator= new Calculator();
        calculator.add(2,3);
//        calculator.add(4,5,5);

    }

}
