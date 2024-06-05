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

    }
}
