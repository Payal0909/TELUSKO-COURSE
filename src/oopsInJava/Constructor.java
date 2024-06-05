package oopsInJava;
class Humans{
    String name;
    int age;

    public Humans() {
        age=18;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Constructor {
    public static void main(String[] args) {

//        1.) Constructor is a method with same class name with no return type and is public
//        2.) Default and parameterised constructor
        Humans human =new Humans();
        System.out.println(human.getAge());
    }

}
