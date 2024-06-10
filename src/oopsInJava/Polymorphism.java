package oopsInJava;

class P{
 void show()
 {
     System.out.println("in P Show");
 }
}
class Q extends P{
    void show()
    {
        System.out.println("in Q Show");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
//         Polymorphism means poly + morphism i.e. many + forms
//         types:
//           1.) Compile time / early binding
//           2.) Runtime / late binding


//         Dynamic method dispatch
//         It means that no matter what the reference type is , it depends
//         on what the object it is pointing towards

          P p =new Q();
          p.show(); // gives output as "in Q show"
    }

}
