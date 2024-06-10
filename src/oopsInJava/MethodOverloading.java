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

         Calc calc =new Calc();
         calc.add(1,2);
         int res=calc.add(3,4,5);
        System.out.println(res);

    }

}
