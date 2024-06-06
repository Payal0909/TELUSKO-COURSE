package oopsInJava;
class CakeBaker extends Baker{
    public void bakeCake() {
        System.out.println("Cake baking....");
    }
}

class Baker{
    public void bake()
    {
        System.out.println("Bakingggg....");
    }
}
public class Inheritance {
    public static void main(String[] args) {
    CakeBaker cakeBaker=new CakeBaker();
    cakeBaker.bakeCake();
    cakeBaker.bake();

//    Multiple inheritance will not work in java i.e. C is child of both A and B
//    This is because in inheritance when child calls a method then it first
//    searches in its class then its parent class then above hierarchy,
//    so if a method is present in both A and B then which one it will call ?(CONFUSED)....
//    hence it leads to ambiguity

    }
}
